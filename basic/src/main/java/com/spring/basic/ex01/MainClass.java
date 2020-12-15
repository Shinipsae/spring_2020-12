package com.spring.basic.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		Chef chef = new Chef(); // 필요하면 객체생성
		Restaurant res = new Restaurant(chef); // 필요하면 생성자로 주입
		Hotel hotel = new Hotel(res); // 필요하면 생성자로 주입
		hotel.reserveRestaurant();
		*/
		
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:test-config.xml");
		
		Hotel hotel = ct.getBean("hotel", Hotel.class);
		hotel.reserveRestaurant();
	}
}
