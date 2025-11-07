package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

// 질문 작성 및 수정 시 사용하는 폼 클래스
@Getter
@Setter
public class QuestionForm {
	@NotEmpty(message = "제목은 필수항목입니다.")
	@Size(max = 200)
	private String subject; // 질문 제목

	@NotEmpty(message = "내용은 필수항목입니다.")
	private String content; // 질문 내용
}
