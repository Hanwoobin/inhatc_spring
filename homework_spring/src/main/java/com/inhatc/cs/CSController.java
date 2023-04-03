package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSController {
	
	@RequestMapping("doA")
	public String doA() {
		System.out.println("call");
		return "doA";
	}
	
	@RequestMapping("doB")
	public String doB() {
		System.out.println("CallB");
		return "sampleURL";
	}
	
}
