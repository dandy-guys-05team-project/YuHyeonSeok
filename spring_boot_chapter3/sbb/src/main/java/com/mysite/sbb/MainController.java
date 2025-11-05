package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 메인 컨트롤러
 * 
 * 애플리케이션의 루트 경로와 메인 페이지를 처리합니다.
 */
@Controller
public class MainController {

	/**
	 * SBB 메인 페이지
	 * @return 환영 메시지
	 */
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 sbb에 오신것을 환영합니다.";
	}

	/**
	 * 루트 경로 접근 시 질문 목록으로 리다이렉트
	 * @return 질문 목록 페이지로 리다이렉트
	 */
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
