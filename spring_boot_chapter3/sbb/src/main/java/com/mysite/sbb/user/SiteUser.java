package com.mysite.sbb.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

// 사이트 사용자 엔티티 클래스
@Getter
@Setter
@Entity
public class SiteUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 사용자 고유 ID

	@Column(unique = true)
	private String username; // 사용자명 (고유값)

	private String password; // 비밀번호 (암호화되어 저장)

	@Column(unique = true)
	private String email; // 이메일 (고유값)
}
