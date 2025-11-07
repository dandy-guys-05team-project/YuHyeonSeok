package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 메인 컨트롤러
@Controller
public class MainController {

	// /sbb 경로로 GET 요청 시 환영 메시지 반환
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 sbb에 오신것을 환영합니다.";
	}

	// 루트 경로(/) 접근 시 질문 목록 페이지로 리다이렉트
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
