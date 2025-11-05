package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import com.mysite.sbb.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * 답변 엔티티 클래스
 * 
 * 게시판의 답변 데이터를 저장하는 JPA 엔티티입니다.
 * 하나의 답변은 하나의 질문에 속합니다.
 */
@Getter
@Setter
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "TEXT")
	private String content;

	private LocalDateTime createDate;

	@ManyToOne
	private Question question;
}
