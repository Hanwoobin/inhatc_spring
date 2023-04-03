package com.voard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
//@ : 지시자 
public class numberController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/1", method = RequestMethod.GET)
	//사용자의 요청을 맵핑 "/"=(root)
	//밑에 있는 
	public String d() {
		
		return "1";
	}
	
	@RequestMapping(value = "/gugudan", method = RequestMethod.GET)
	//사용자의 요청을 맵핑 "/"=(root)
	//밑에 있는 
	public String d1() {
		
		return "gugudan";
	}
	@RequestMapping(value = "/sosu", method = RequestMethod.GET)
	//사용자의 요청을 맵핑 "/"=(root)
	//밑에 있는 
	public String d2() {
		
		return "sosu";
	}
	
	@RequestMapping(value = "/lotto", method = RequestMethod.GET)
	//사용자의 요청을 맵핑 "/"=(root)
	//밑에 있는 
	public String d3() {
		
		return "lotto";
	}
	
	
	
	
}
