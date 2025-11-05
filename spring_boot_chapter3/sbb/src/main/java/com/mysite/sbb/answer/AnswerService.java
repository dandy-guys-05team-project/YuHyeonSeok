package com.mysite.sbb.answer;

import com.mysite.sbb.question.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * 답변 서비스 클래스
 * 
 * 답변 관련 비즈니스 로직을 처리하는 서비스입니다.
 */
@RequiredArgsConstructor
@Service
public class AnswerService {

	private final AnswerRepository answerRepository;

	/**
	 * 새로운 답변 생성
	 * @param question 답변이 속한 질문 객체
	 * @param content 답변 내용
	 */
	public void create(Question question, String content) {
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now());
		answer.setQuestion(question);
		this.answerRepository.save(answer);
	}
}
