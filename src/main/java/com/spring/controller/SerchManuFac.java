package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.SerchManuFacService;
import com.spring.vo.ManuFacVO;

@Controller("serchManuFac")
public class SerchManuFac {
	
	@Autowired
	SerchManuFacService service;
	
	@RequestMapping("/serchByFacLoc")
	public List<ManuFacVO> serchByFacLoc(String loc) {
		//위치 정보를 문자열로 받아 db에서 문자열이 포함된 vo를 검색하여 화단으로 넘겨준다.
		System.out.println("실행");
		List<ManuFacVO> facList = service.serchByFacLoc(loc);
		System.out.println(facList);
		return null;
	}
	public List<ManuFacVO> serchByFacType(String manuFacType){
		//업종 정보를 문자열로 받아 db에서 문자열이 포함된 vo를 검색하여 화면단으로 넘겨준다.
		List<ManuFacVO> facList = service.serchByFacType(manuFacType);
		return null;
	}
	public List<ManuFacVO> serchByFacPrice(int productprice){
		//최소 발주 금액을 int로 받아 db에서 특정금액 이하 인 vo를검색하여 화면단으로 넘겨준다.
		List<ManuFacVO> facList = service.serchByFacPrice(productprice);
		return null;
	}
	
	@RequestMapping("/viewManuFac/*")
	public ModelAndView viewManuFac(String id) {
		//제조업체 id를 받아 db에서 조회 후 vo를 화면단으로 넘겨준다.
		ManuFacVO fac= (ManuFacVO) service.viewManuFac(id);
		return null;
	}
}
