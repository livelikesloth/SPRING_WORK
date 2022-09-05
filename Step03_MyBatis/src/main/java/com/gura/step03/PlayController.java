package com.gura.step03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.step03.aspect.AuthAspect;

@Controller
public class PlayController {
	
	//로그인된 클라이언트의 요청만 정상수행하는 메소드
	@RequestMapping("/play")
	public ModelAndView authPlay(ModelAndView mView, HttpServletRequest request) {
		
		mView.setViewName("play");
		
		return mView;
	}
	//로그인된 클라이언트의 요청만 정상수행하는 메소드
	@RequestMapping("/sub/play2")
	public ModelAndView authPlay2(ModelAndView mView, HttpServletRequest request) {
		
		mView.setViewName("sub/play2");
		
		return mView;
	}
}










