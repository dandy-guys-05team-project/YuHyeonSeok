package com.mysite.sbb.answer;

import org.springframework.data.jpa.repository.JpaRepository;

// 답변 엔티티에 대한 데이터베이스 접근을 위한 리포지토리 인터페이스
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
