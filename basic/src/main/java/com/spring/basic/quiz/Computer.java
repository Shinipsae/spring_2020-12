package com.spring.basic.quiz;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {

	// 방법 1
	@Autowired
	private Keyboard keyboard;
	@Autowired
	private Mouse mouse;
	@Autowired
	private Monitor monitor;
	
	public Computer() {}
	
	/*
	 // 방법 2
	 @Autowired
	 public Computer(Monitor monitor, Keyboard keyboard, Mouse mouse){
	 	super();
	 	this.monitor = monitor;
	 	this.keyboard = keyboard;
	 	this.mouse = mouse;
	 } 
	 */

	public void computerInfo() {
		System.out.println("*** 컴퓨터의 정보 *** ");
		keyboard.info();
		mouse.info();
		monitor.info();
	}
	
}
