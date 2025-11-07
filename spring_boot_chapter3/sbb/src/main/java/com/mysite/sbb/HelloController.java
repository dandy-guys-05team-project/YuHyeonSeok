package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 테스트용 Hello 컨트롤러
@Controller
public class HelloController {
	// /hello 경로로 GET 요청 시 "Hello Spring Boot Board" 문자열 반환
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot Board";
	}
}
