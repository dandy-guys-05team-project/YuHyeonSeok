package com.mysite.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 질문답변 게시판 애플리케이션
 * 
 * 질문과 답변을 작성하고 관리할 수 있는 간단한 게시판 프로젝트입니다.
 * Spring Boot, JPA, Thymeleaf를 활용하여 구현했습니다.
 * 
 * @author 개인 프로젝트
 * @version 1.0
 */
@SpringBootApplication
public class SbbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
	}

}
