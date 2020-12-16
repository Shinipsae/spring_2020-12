package com.spring.basic.ex04;

import javax.annotation.Resource;

public class Book {

	/*
	 @Resource
	 - 빈을 자동 주입하는 어노테이션
	 - 필드, 메서드에만 적용이 가능하며, 생성자에는 적용이 불가능함.
	 - name 속성ㅇ르 통해 특정 bean의 id를 지목할 수 있음
	 */
	
//	@Autowired
//	@Qualifier("paper2")
	@Resource(name="paper2")
	private Paper paper;
	
	public Book() { // 기본 생성자
		
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
}
