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
//@ : ������ 
public class numberController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/1", method = RequestMethod.GET)
	//������� ��û�� ���� "/"=(root)
	//�ؿ� �ִ� 
	public String d() {
		
		return "1";
	}
	
	@RequestMapping(value = "/gugudan", method = RequestMethod.GET)
	//������� ��û�� ���� "/"=(root)
	//�ؿ� �ִ� 
	public String d1() {
		
		return "gugudan";
	}
	@RequestMapping(value = "/sosu", method = RequestMethod.GET)
	//������� ��û�� ���� "/"=(root)
	//�ؿ� �ִ� 
	public String d2() {
		
		return "sosu";
	}
	
	@RequestMapping(value = "/lotto", method = RequestMethod.GET)
	//������� ��û�� ���� "/"=(root)
	//�ؿ� �ִ� 
	public String d3() {
		
		return "lotto";
	}
	
	
	
	
}
