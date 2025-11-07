package com.mysite.sbb.answer;

import java.time.LocalDateTime;
import java.util.Set;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.user.SiteUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

// 답변 엔티티 클래스
@Getter
@Setter
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; // 답변 고유 ID

	@Column(columnDefinition = "TEXT")
	private String content; // 답변 내용

	private LocalDateTime createDate; // 답변 작성일시

	@ManyToOne
	private Question question; // 답변이 속한 질문 (다대일 관계)

	@ManyToOne
	private SiteUser author; // 답변 작성자 (다대일 관계)

	private LocalDateTime modifyDate; // 답변 수정일시
	
	@ManyToMany
    Set<SiteUser> voter; // 답변 추천한 사용자들 (다대다 관계)
}
