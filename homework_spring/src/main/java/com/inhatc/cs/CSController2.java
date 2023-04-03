package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.memberVO;

@Controller
public class CSController2 {
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		return "result";
	}
	
	@RequestMapping("memberDetail")
	public String member(Model model1) {
		memberVO member = new memberVO("ÇÑ¿ìºó", "woobin");
		model1.addAttribute(member);
		
		
		return "member";
	}
	
}
