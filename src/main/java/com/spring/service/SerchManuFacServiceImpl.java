package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.SerchManuFacDAO;
import com.spring.vo.ManuFacVO;

@Service
public class SerchManuFacServiceImpl implements SerchManuFacService{
	@Autowired
	SerchManuFacDAO dao;
	
	@Override
	public List<ManuFacVO> serchByFacLoc(String loc){
		List<ManuFacVO> facList = dao.serchByFacLoc(loc);
		return facList;
	}
	
	@Override
	public List<ManuFacVO> serchByFacType(String manuFacType){
		List<ManuFacVO> facList = dao.serchByFacType(manuFacType);
		return facList;
	}
	
	@Override
	public List<ManuFacVO> serchByFacPrice(int productprice){
		List<ManuFacVO> facList = dao.serchByFacPrice(productprice);
		return facList;
	}
	
	@Override
	public ManuFacVO viewManuFac(String id){
		ManuFacVO vo= dao.viewManuFac(id);
		return vo;
	}
}
