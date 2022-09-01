package com.livelikesloth.step03.todo.dto;

public class TodoDto {
	private int num;
	private String content;
	private String sysdate;
	
	public TodoDto() {}

	public TodoDto(int num, String content, String sysdate) {
		super();
		this.num = num;
		this.content = content;
		this.sysdate = sysdate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSysdate() {
		return sysdate;
	}

	public void setSysdate(String sysdate) {
		this.sysdate = sysdate;
	}
	
	

}
