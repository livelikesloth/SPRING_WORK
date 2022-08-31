package com.livelikesloth.step03;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

		@RequestMapping("/home.do")
	public String home(HttpServletRequest request) {
			List<String> noticeList =new ArrayList<String>();
			noticeList.add("공지사항입니다.");
		return "home";
	}
	
}
