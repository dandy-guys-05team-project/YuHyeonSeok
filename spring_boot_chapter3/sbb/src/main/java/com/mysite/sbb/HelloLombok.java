package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Lombok 라이브러리 테스트를 위한 클래스
 * 
 * @RequiredArgsConstructor와 @Getter 어노테이션의 동작을 확인하기 위한 예제입니다.
 */
@RequiredArgsConstructor
@Getter
public class HelloLombok {
	private final String hello;
	private final int lombok;

	/**
	 * Lombok 테스트 메인 메서드
	 * @param args 커맨드 라인 인자
	 */
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("헬로", 5);
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}
}
