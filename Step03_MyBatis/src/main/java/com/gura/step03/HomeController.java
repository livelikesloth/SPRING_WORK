package com.gura.step03;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// /home.do 요청이 왔을때 동작하는 컨트롤러 메소드 
	@RequestMapping("/home.do")
	public String home(HttpServletRequest request, HttpServletResponse response) {
		
		//DB 에서 읽어온 공지사항 이라고 가정하자 
		List<String> noticeList=new ArrayList<>();
		noticeList.add("Spring Framework 시작입니다.");
		noticeList.add("화이팅!");
		noticeList.add("어쩌구...");
		noticeList.add("저쩌꾸...");
		
		//view page 에 전달할 Model(data) 을  request 영역에 담기
		request.setAttribute("noticeList", noticeList);
		
		// /WEB-INF/views/home.jsp 페이지로 forward 이동해서 응답
		return "home";
	}
}














