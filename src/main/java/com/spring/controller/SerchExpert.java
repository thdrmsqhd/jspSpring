package com.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.vo.ExpertVO;

public class SerchExpert {
	public List<ExpertVO> serchByExpertName(String expertName){
		//전문가 이름을 문자열로 받아 db에서 조회한 후 vo를 화면에 출력한다.
		return null;
	}
	
	public List<ExpertVO> serchByExpertType(String expertType){
		//전문가 업종을 문자열로 받아 db에서 조회 한 후 vo를 화면에 출력한다.
		return null;
	}
	
	@RequestMapping("/viewExpert/*")
	public ModelAndView viewExpert(String id) {
		//전문가 id를 받아 db에서 조회 한 후 vo를 화면에 출력한다.
		return null;
	}
}
