package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

import lombok.RequiredArgsConstructor;

/**
 * 질문 서비스 클래스
 * 
 * 질문 관련 비즈니스 로직을 처리하는 서비스입니다.
 */
@RequiredArgsConstructor
@Service
public class QuestionService {

	private final QuestionRepository questionRepository;

	/**
	 * 모든 질문 목록 조회
	 * @return 질문 목록
	 */
	public List<Question> getList() {
		return this.questionRepository.findAll();
	}

	/**
	 * ID로 질문 조회
	 * @param id 질문 ID
	 * @return 질문 객체
	 * @throws DataNotFoundException 질문을 찾을 수 없을 경우
	 */
	public Question getQuestion(Integer id) {
		Optional<Question> question = this.questionRepository.findById(id);
		if (question.isPresent()) {
			return question.get();
		} else {
			throw new DataNotFoundException("question not found");
		}
	}

	/**
	 * 새로운 질문 생성
	 * @param subject 질문 제목
	 * @param content 질문 내용
	 */
	public void create(String subject, String content) {
		Question q = new Question();
		q.setSubject(subject);
		q.setContent(content);
		q.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q);
	}
}
