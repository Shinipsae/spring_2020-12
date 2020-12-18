package com.spring.web.model;

public class BirthVO {
	private String year;
	private String month;
	private String date;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		if(Integer.parseInt(month) < 10) { // 10 미만이라면
			this.month = "0" + month;
		} else {
			this.month = month;
		}
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
	//	if(Integer.parseInt(date) < 10) {
		if(date.length() < 2) { // 길이가 1이면 (2미만이면)
			this.date = "0" + date;
		} else {
			this.date = date;
		}
	}
	
	@Override
	public String toString() {
		return year + month + date;
	}
}
