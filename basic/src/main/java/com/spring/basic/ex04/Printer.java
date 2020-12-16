package com.spring.basic.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	/*
	 @Autowired
	 - 객체를 자동 주입할 때 사용하는 어노테이션
	 - 스캔 명령을 통해 객체를 찾아 주입하는데, 타입이름으로 검색함
	 - 타입을 찾아내지 못하면 id속성값을 통해 검색
	 - 생성자, 메서드, 필드(선언)에 적용가능 
	 - 필드에 자동 주입 설정을 할 때는 기본 생성자가 반드시 있어야 함
	 @Qualifier("bean id")
	 - Autowired를 사용할 때 동일 타입의 빈이 여러 개 있을경우
	 어떤 빈을 주입해야하는지 선택해주는 추가 어노테이션
	 
	  */
	
	@Autowired
	@Qualifier("paper1")
	private Paper paper;
	
	public Printer() {} // 기본생성자
	
	//@Autowired
	public Printer(Paper paper) {
		this.paper = paper;
	}
	
//	@Autowired
//	public void setPaper(Paper paper) {
//		this.paper = paper;
//	}
	
	public void showPaperInfo() {
		for(String info : paper.data) {
			System.out.println(info);
		}
	}
	
}
