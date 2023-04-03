package com.inhatc.cs;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.productVO;

@Controller
public class CSController3 {
	@RequestMapping("doD")
	public String doD(Model model1) {
		
		
		productVO productDTO = new productVO("samplecode", 100);
		System.out.println("doD");
		
		model1.addAttribute(productDTO);
		
		return "productDetail";
	}
}
