package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.user.SiteUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

// 질문 엔티티 클래스
@Getter
@Setter
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; // 질문 고유 ID

	@Column(length = 200)
	private String subject; // 질문 제목

	@Column(columnDefinition = "TEXT")
	private String content; // 질문 내용

	private LocalDateTime createDate; // 질문 작성일시

	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
	private List<Answer> answerList; // 질문에 달린 답변 목록 (일대다 관계, 질문 삭제 시 답변도 함께 삭제)

	@ManyToOne
	private SiteUser author; // 질문 작성자 (다대일 관계)

	private LocalDateTime modifyDate; // 질문 수정일시
	
	@ManyToMany
    Set<SiteUser> voter; // 질문 추천한 사용자들 (다대다 관계)
}
