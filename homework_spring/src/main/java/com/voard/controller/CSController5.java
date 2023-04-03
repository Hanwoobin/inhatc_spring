package com.voard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.productVO;

@Controller
public class CSController5 {
	@RequestMapping("doJSON")
	public @ResponseBody productVO doJSON() {
		
		productVO pvo = new productVO("sample", 111);
		return pvo;
		
		
	}
}
