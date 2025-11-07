package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// 질문 엔티티에 대한 데이터베이스 접근을 위한 리포지토리 인터페이스
public interface QuestionRepository extends JpaRepository<Question, Integer> {
	// 제목으로 질문 조회
	Question findBySubject(String subject);

	// 제목과 내용으로 질문 조회
	Question findBySubjectAndContent(String subject, String content);

	// 제목에 특정 문자열이 포함된 질문 목록 조회
	List<Question> findBySubjectLike(String subject);

	// 페이지네이션을 포함한 전체 질문 목록 조회
	Page<Question> findAll(Pageable pageable);

	// Specification과 페이지네이션을 포함한 질문 목록 조회
	Page<Question> findAll(Specification<Question> spec, Pageable pageable);
	
	// 키워드 검색을 포함한 질문 목록 조회 (제목, 내용, 작성자, 답변 내용, 답변 작성자 검색)
	@Query("select "
            + "distinct q "
            + "from Question q " 
            + "left outer join SiteUser u1 on q.author=u1 "
            + "left outer join Answer a on a.question=q "
            + "left outer join SiteUser u2 on a.author=u2 "
            + "where "
            + "   q.subject like %:kw% "
            + "   or q.content like %:kw% "
            + "   or u1.username like %:kw% "
            + "   or a.content like %:kw% "
            + "   or u2.username like %:kw% ")
    Page<Question> findAllByKeyword(@Param("kw") String kw, Pageable pageable);
}
