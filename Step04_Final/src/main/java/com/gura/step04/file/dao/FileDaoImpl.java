package com.gura.step04.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.step04.file.dto.FileDto;

@Repository
public class FileDaoImpl implements FileDao{
	@Autowired
	private SqlSession session;

	@Override
	public void insert(FileDto dto) {
		/*
		 *  mapper's namespace : file
		 *  sql's id : insert
		 *  parameterType
		 */
		session.insert("file.insert", dto);
	}

	@Override
	public FileDto getData(int num) {
		
		return session.selectOne("file.getData", num);
	}

	@Override
	public void delete(int num) {
		session.delete("file.delete", num);
	}

	@Override
	public List<FileDto> getList(FileDto dto) {
		/*
		 * mapper's namespace : file
		 * sql's id : getList
		 * parameterType : FileDto
		 * resultType : FileDto
		 */
		
		return session.selectList("file.getList", dto);
	}

	@Override
	public int getCount(FileDto dto) {
		//검색 키워드에 맞는 전체 row의 갯수를 얻어와야 하기 때문에 FileDto를 parameterType으로 전달한다. 
		return session.selectOne("file.getCount", dto);
	}
	
	
}




