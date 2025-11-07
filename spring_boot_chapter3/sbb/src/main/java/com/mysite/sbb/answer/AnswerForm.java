package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

// 답변 작성 및 수정 시 사용하는 폼 클래스
@Getter
@Setter
public class AnswerForm {
	@NotEmpty(message = "내용은 필수항목입니다.")
	private String content; // 답변 내용
}
