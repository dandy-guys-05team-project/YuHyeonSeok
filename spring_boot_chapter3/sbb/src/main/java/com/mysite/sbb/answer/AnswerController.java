package com.mysite.sbb.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/**
 * 답변 컨트롤러
 * 
 * 답변 생성 기능을 제공하는 컨트롤러입니다.
 */
@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

	private final QuestionService questionService;
	private final AnswerService answerService;

	/**
	 * 답변 생성 처리
	 * @param model 뷰에 전달할 모델 객체
	 * @param id 질문 ID
	 * @param answerForm 답변 작성 폼 데이터
	 * @param bindingResult 유효성 검사 결과
	 * @return 질문 상세 페이지로 리다이렉트
	 */
	@PostMapping("/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, @Valid AnswerForm answerForm,
			BindingResult bindingResult) {
		Question question = this.questionService.getQuestion(id);
		if (bindingResult.hasErrors()) {
			model.addAttribute("question", question);
			return "question_detail";
		}
		this.answerService.create(question, answerForm.getContent());
		return String.format("redirect:/question/detail/%s", id);
	}
}
