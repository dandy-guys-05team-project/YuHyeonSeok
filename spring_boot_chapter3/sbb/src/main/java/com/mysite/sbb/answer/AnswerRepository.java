package com.mysite.sbb.answer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 답변 레포지토리 인터페이스
 * 
 * 답변 엔티티에 대한 데이터베이스 접근을 처리하는 레포지토리입니다.
 * Spring Data JPA를 활용하여 기본 CRUD 기능을 제공합니다.
 */
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
