package com.mysite.sbb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 데이터를 찾을 수 없을 때 발생하는 예외 클래스
 * 
 * 요청한 데이터가 존재하지 않을 경우 404 에러를 반환합니다.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
public class DataNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * 예외 메시지를 포함한 생성자
	 * @param message 예외 메시지
	 */
	public DataNotFoundException(String message) {
		super(message);
	}
}
