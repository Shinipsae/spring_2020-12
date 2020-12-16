package com.spring.basic.ex04;

import java.util.Arrays;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:auto-config.xml");
		
		Printer printer = ct.getBean("print", Printer.class);
		
		printer.showPaperInfo();
		System.out.println();
		System.out.println("책 내용 확인!");
		Book book = ct.getBean("book", Book.class);
		String datas = Arrays.toString(book.getPaper().data); // 배열 출력  
		System.out.println(datas);
	}
}
