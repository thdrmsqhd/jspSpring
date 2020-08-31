package com.spring.dao;

import java.util.List;

import com.spring.vo.ManuFacVO;

public interface SerchManuFacDAO {

	List<ManuFacVO> serchByFacLoc(String loc);

	List<ManuFacVO> serchByFacType(String manuFacType);

	List<ManuFacVO> serchByFacPrice(int productprice);

	ManuFacVO viewManuFac(String id);

}
