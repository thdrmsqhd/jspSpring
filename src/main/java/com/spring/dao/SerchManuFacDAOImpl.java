package com.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.vo.ManuFacVO;

@Repository
public class SerchManuFacDAOImpl implements SerchManuFacDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<ManuFacVO> serchByFacLoc(String loc){
		List<ManuFacVO> facList = sqlSession.selectList("mapper.manufac.selectByLoc",loc);
		return facList;
	}
	
	@Override
	public List<ManuFacVO> serchByFacType(String manuFacType){
		List<ManuFacVO> facList = sqlSession.selectList("mapper.manufac.selectByType",manuFacType);
		return facList;
	}
	
	@Override
	public List<ManuFacVO> serchByFacPrice(int productprice){
		List<ManuFacVO> facList = sqlSession.selectList("mapper.manufac.selectByPrice",productprice);
		return facList;
	}
	
	@Override
	public ManuFacVO viewManuFac(String id) {
		ManuFacVO vo= sqlSession.selectOne("mapper.manufac.selectById", id);
		return vo;
	}
}
