package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CSController4 {
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		
		System.out.println("doE");
		
		rttr.addFlashAttribute("msg","redirect msg is ~EGASD");
		return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public String doC(@ModelAttribute("msg") String msg) {
		return "doF";
	}
	
	
}
