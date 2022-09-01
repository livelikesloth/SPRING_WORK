package com.livelikesloth.step03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.livelikesloth.step03.member.dao.MemberDao;
import com.livelikesloth.step03.member.dto.MemberDto;

/*
 *  1.Jackson-databind 라이브러리가 Dependency에 명시되어 있고
 *  2.servlet-context.xml에 <annotation0driven/> 이 명시 되어있고
 *  3.컨트롤러의 메소드에@ResponseBody 어노테이션이 붙어있으면
 *  Map or dto or List 객체에 담긴 내용이 json 문자열로 변환되어 응답한다.
 */
@Controller
public class JSONTestController {
	
	@RequestMapping("/send")
	@ResponseBody
	public Map<String, Object> send(String msg) {
		Map<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "두부");
		map.put("isMale", true);
		return map;	
	}
	@RequestMapping("/send2")
	@ResponseBody
	public MemberDto send2(String msg) {
		MemberDto dto = new MemberDto(2, "유키", "하이데저트");
		return dto;
	}
	@RequestMapping("/send3")
	@ResponseBody
	public List<String> send3(String msg){
		List<String> list = new ArrayList<String>();
		list.add("하나");
		list.add("두울");
		list.add("세엣");
		return list;
	}
	@Autowired
	private MemberDao dao;
	@RequestMapping("/send4")
	@ResponseBody
	public List<MemberDto> send4(String msg){
		return dao.getList();                                                                                                                                                                                                                                                                   
	}
}










