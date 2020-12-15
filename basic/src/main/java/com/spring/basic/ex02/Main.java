package com.spring.basic.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
	/*	DatabaseInfo dbInfo = new DatabaseInfo(); // 필요하니까 직접 생성
		dbInfo.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		dbInfo.setUid("spring1");
		dbInfo.setUpw("sss111");
		
		MemberDAO dao = new MemberDAO();
		dao.setDbInfo(dbInfo);
		dao.showDBInfo();
	*/
		
		GenericXmlApplicationContext ct =
				new GenericXmlApplicationContext("classpath:db-config.xml");
		
		MemberDAO dao = ct.getBean("dao", MemberDAO.class); // setter 주입
		dao.showDBInfo(); // 주입하고 갖고와 출력해
	}
}
