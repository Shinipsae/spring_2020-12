package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.web.model.UserVO;

// 자동으로 스프링 컨테이너에 해당 클래스의 빈을 등록하는 어노테이션
@Controller
@RequestMapping("/request")
public class RequestController {
	
	public RequestController() {
		System.out.println("RequestionController 작동!");
	}
	
	// RequestMapping은 어떤 URI로 이 메서드를 동작시킬 것인가에 대한 설정
	// (이 URI로 요청을 하면  - 검색창에 치면, 리턴한문자열.jsp로 보여준다.)
	@RequestMapping("/test")
	public String testCall() {
		System.out.println("/request/test 요청이 들어옴!");
		return "request/test"; // /WEB-INF/views/test.jsp 를 호출
	}
	
	/* 만약 /request/req 요청이 들어왔을 때
	 * views 폴더 아래에 있는 request폴더 아리에
	 * req-ex01.jsp 파일을 열도록 메서드를 구성해부세요.
	 * */
	@RequestMapping("/req") // 기본페이지
	public String req() {
		System.out.println("/request/req 요청이 들어옴!");
		return "request/req-ex01";
		// prefix가 /WEB-INF/views/ 까지이므로 request부터 써야함
	}
	
	// 요청에 따른 페이지
	// @RequestMapping(value="/request/basic01", method=RequestMethod.GET)
	@GetMapping("/basic01")
	public String basicGet() {
		System.out.println("/request/basic01 요청이 들어옴! : GET");
		return "request/req-ex01";
	}
	
	// 요청에 따른 페이지
	// @RequestMapping(value="/request/basic01", method=RequestMethod.POST)
	@PostMapping("/basic01")
	public String basicPost() {
		System.out.println("/request/basic01 요청이 들어옴! : POST");
		return "request/req-ex01";
	}
	
	// 컨트롤러의 요청 메서드를 void 리턴 타입으로 지정
	@GetMapping("/req-ex02")
	public void reqEx02() { // void 타입이면 uri에 있는 이름으로 jsp 파일을 호출
		System.out.println("/request/req-ex02 요청이 들어옴! : GET");
	}
	
	/////////////////////////////////////////////////////////////////////
	
	@GetMapping("/join")
	public void register() {
		System.out.println("/request/join: GET");
	}
	
	/*
	  1. 전통적인 jsp / servlet 방식의 파라미터 읽기 처리 방법.
	  - HTTPServletRequest 객체를 사용
	
	@PostMapping("/join")
	public void register(HttpServletRequest request) {
		System.out.println("/request/join: POST");
		System.out.println("ID: " + request.getParameter("userId"));
		System.out.println("PW: " + request.getParameter("userPw"));
		System.out.println("NAME: " + request.getParameter("userName"));
		System.out.println("HOBBY: " + Arrays.toString(request.getParameterValues("hobby")));
	}
	*/
	
	/*
	 2. @RequestParam 어노테이션을 이용한 요청 파라미터 처리.
	 
	@PostMapping("/join")
	public void register(@RequestParam("userId") String id,
							@RequestParam("userPw") String pw,
							@RequestParam(value="hobby", required=false,
							defaultValue="no hobby person") List<String> hobbys) {
		
		System.out.println("ID: " + id);
		System.out.println("PW: " + pw);
		System.out.println("HOBBY: " + hobbys);
	}
	*/
	
	/*
	 3. 커맨드 객체를 활용한 파라미터 처리
	 */
	@PostMapping("/join")
	public void register(UserVO user) {
		System.out.println("ID: " + user.getUserId());
		System.out.println("PW: " + user.getUserPw());
		System.out.println("NAME:" + user.getUserName());
		System.out.println("HOBBY: " + user.getHobby());
	}
	
	/*******************************************************************/
	
	@GetMapping("/quiz") // 기본 화면을 띄우는 메소드
	public String quiz() {
		System.out.println("/request/quiz");
		return "request/req-quiz";
	}
	
	@PostMapping("/quiz") // 추가 요청에 필요한 메소드
	public String quiz(UserVO user) {
		if(user.getUserId().equals("abc1234") && user.getUserPw().equals("aaa1111")) {
			System.out.println("아이디, 비밀번호 일치!");
			return "request/login-success";
		} else {
			System.out.println("아이디 또는 비밀번호 불일치!");
			return "request/login-fail";
		}
	}
	
}
