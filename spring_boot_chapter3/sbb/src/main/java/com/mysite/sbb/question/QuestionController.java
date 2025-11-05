package com.mysite.sbb.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysite.sbb.answer.AnswerForm;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/**
 * 질문 컨트롤러
 * 
 * 질문 목록 조회, 상세 조회, 생성 기능을 제공하는 컨트롤러입니다.
 */
@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {

	private final QuestionService questionService;

	/**
	 * 질문 목록 조회
	 * @param model 뷰에 전달할 모델 객체
	 * @return 질문 목록 페이지
	 */
	@GetMapping("/list")
	public String list(Model model) {
		List<Question> questionList = this.questionService.getList();
		model.addAttribute("questionList", questionList);
		return "question_list";
	}

	/**
	 * 질문 상세 조회
	 * @param model 뷰에 전달할 모델 객체
	 * @param id 질문 ID
	 * @param answerForm 답변 작성 폼
	 * @return 질문 상세 페이지
	 */
	@GetMapping(value = "/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm) {
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question", question);
		return "question_detail";
	}

	/**
	 * 질문 작성 폼 페이지
	 * @param questionForm 질문 작성 폼
	 * @return 질문 작성 페이지
	 */
	@GetMapping("/create")
	public String questionCreate(QuestionForm questionForm) {
		return "question_form";
	}

	/**
	 * 질문 생성 처리
	 * @param questionForm 질문 작성 폼 데이터
	 * @param bindingResult 유효성 검사 결과
	 * @return 질문 목록 페이지로 리다이렉트
	 */
	@PostMapping("/create")
	public String questionCreate(@Valid QuestionForm questionForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "question_form";
		}
		this.questionService.create(questionForm.getSubject(), questionForm.getContent());
		return "redirect:/question/list";
	}
}
