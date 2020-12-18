package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.spring.web.model.BirthVO;

@Controller
public class BirthController {
	public BirthController() {
		System.out.println("BirthController 작동!");
	}
	
	// 생일을 입력하는 폼을 열어주는 요청 메서드
	@GetMapping("/birth")
	public String birth() {
		return "birth/birthform";
	}
	
	// 생일 정보를 result 페이지에 전달하는 요청 메서드
	@PostMapping("/birth")
	public String birth(BirthVO vo, Model model) {
		// @ModelAttribute("birth") BirthvVO birth 매개변수에 넣고
		// 밑에 따로 addAttribute 할 필요 없음
		String year = vo.getYear();
		String month = vo.getMonth();
		String date = vo.getDate();
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("date", date);
		System.out.println(vo.toString());
		return "birth/birth-result";
	}
}
