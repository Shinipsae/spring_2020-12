package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	@GetMapping("/res-ex01")
	public void resEx01() {
		
	}
	
}
