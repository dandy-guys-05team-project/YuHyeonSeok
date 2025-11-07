package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// Lombok 라이브러리 테스트용 클래스
@RequiredArgsConstructor
@Getter
public class HelloLombok {
	private final String hello; // hello 필드
	private final int lombok; // lombok 필드

	// Lombok 기능 테스트를 위한 메인 메서드
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("헬로", 5);
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}
}
