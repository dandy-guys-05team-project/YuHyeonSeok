package com.mysite.sbb.user;

import lombok.Getter;

// 사용자 권한을 정의하는 열거형
@Getter
public enum UserRole {
	ADMIN("ROLE_ADMIN"), // 관리자 권한
	USER("ROLE_USER"); // 일반 사용자 권한

	UserRole(String value) {
		this.value = value;
	}

	private String value; // 권한 값
}
