package com.livelikesloth.step03.todo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.livelikesloth.step03.todo.dao.TodoDao;
import com.livelikesloth.step03.todo.dto.TodoDto;

@Controller
public class TodoController {
	
	@Autowired
	private TodoDao dao;
	
	@RequestMapping("/todo/list")
	public String list(HttpServletRequest request) {
		List<TodoDto> list = dao.getList();
		request.setAttribute("list", list);
		return "todo/list";
	}
	@RequestMapping("/todo/insertform")
	public String insertform() {
		return "todo/insertform";
	}
	@RequestMapping("/todo/insert")
	public String insert(TodoDto dto) {
		dao.insert(dto);
		return "todo/insert";
	}
	@RequestMapping("/todo/updateform")
	public String updateform(int num, HttpServletRequest request) {
		TodoDto dto = dao.getData(num);
		request.setAttribute("dto", dto);
		return "todo/updateform";
	}
	@RequestMapping("/todo/update")
		public String update(TodoDto dto) {
		dao.update(dto);
		return "todo/update";
	}
	@RequestMapping("/todo/delete")
	public String delete(int num) {
		dao.delete(num);
		return "todo/delete";
	}
}
