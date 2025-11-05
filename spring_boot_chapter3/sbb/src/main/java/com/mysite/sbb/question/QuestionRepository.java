package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 질문 레포지토리 인터페이스
 * 
 * 질문 엔티티에 대한 데이터베이스 접근을 처리하는 레포지토리입니다.
 * Spring Data JPA를 활용하여 기본 CRUD 및 커스텀 쿼리 메서드를 제공합니다.
 */
public interface QuestionRepository extends JpaRepository<Question, Integer> {
	Question findBySubject(String subject);

	Question findBySubjectAndContent(String subject, String content);

	List<Question> findBySubjectLike(String subject);
}
