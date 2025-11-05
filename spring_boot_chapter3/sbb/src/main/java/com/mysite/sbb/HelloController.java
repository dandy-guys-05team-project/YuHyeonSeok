package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello 컨트롤러
 * 
 * Spring Boot 애플리케이션 테스트를 위한 간단한 컨트롤러입니다.
 */
@Controller
public class HelloController {
	
	/**
	 * Hello 엔드포인트 테스트
	 * @return "Hello Spring Boot Board" 문자열
	 */
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot Board";
	}
}
