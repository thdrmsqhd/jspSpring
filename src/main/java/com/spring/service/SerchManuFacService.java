package com.spring.service;

import java.util.List;

import com.spring.vo.ManuFacVO;

public interface SerchManuFacService {

	List<ManuFacVO> serchByFacLoc(String loc);

	List<ManuFacVO> serchByFacType(String menuFacType);

	List<ManuFacVO> serchByFacPrice(int productprice);

	ManuFacVO viewManuFac(String id);

	

}
