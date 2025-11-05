package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * 질문 작성 폼 클래스
 * 
 * 질문 작성 시 사용되는 폼 데이터를 담는 DTO 클래스입니다.
 * 유효성 검증 어노테이션을 포함하고 있습니다.
 */
@Getter
@Setter
public class QuestionForm {
	@NotEmpty(message = "제목은 필수항목입니다.")
	@Size(max = 200)
	private String subject;

	@NotEmpty(message = "내용은 필수항목입니다.")
	private String content;
}
