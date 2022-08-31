package com.livelikesloth.step02;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// /home.do 요청이 왔을 때 동작하는 컨트롤러 메소드
	@RequestMapping("/home.do")
	public String home(HttpServletRequest request) {
		List<String> noticeList = new ArrayList<String>();
		noticeList.add("공지사항 입니다.");

		request.setAttribute("noticeList", noticeList);

		// /WEB-INF/views/home.jsp 페이지로 forward 이동해서 응답
		return "home";
	}
}