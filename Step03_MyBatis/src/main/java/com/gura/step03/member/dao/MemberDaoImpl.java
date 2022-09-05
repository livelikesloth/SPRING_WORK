package com.gura.step03.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.step03.member.dto.MemberDto;

//MemberDaoImple 객체도 spring bean container 에서 관리가 되도록한다.
@Repository
public class MemberDaoImpl implements MemberDao{
	
	// spring bean container 에서 SqlSession type 객체를 찾아서 주입해(DI) 주세요 라는 의미 
	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(MemberDto dto) {
		/*
		 *  Mapper's namespace : member
		 *  sql's id : insert
		 *  parameterType : MemberDto
		 */
		session.insert("member.insert", dto);
	}

	@Override
	public void update(MemberDto dto) {
		/*
		 *  Mapper's namespace : member
		 *  sql's id : update
		 *  parameterType : 
		 */
		session.update("member.update", dto);
	}

	@Override
	public void delete(int num) {
		/*
		 *  Mapper's namespace : member
		 *  sql's id : delete
		 *  parameterType : int
		 */
		session.delete("member.delete", num);
	}

	@Override
	public MemberDto getData(int num) {
		/* 
		 *  Mapper's namespace : member
		 *  sql's id : getData
		 *  pararmeterType : int
		 *  resultType : MemberDto
		 *   
		 */
		MemberDto dto=session.selectOne("member.getData", num);
		
		return dto;
	}

	@Override
	public List<MemberDto> getList() {
		/* 
		 *  Mapper's namespace : member
		 *  sql's id : getList
		 *  pararmeterType : 없음
		 *  resultType : MemberDto
		 *   
		 */
		List<MemberDto> list=session.selectList("member.getList");
		
		return list;
	}

}








