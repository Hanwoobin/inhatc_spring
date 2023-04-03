package com.inhatc.domain;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.persistence.members_DAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class testmembers1_GetTime {
	
	@Inject
	private members_DAO dao;
	
	@Test
	public void testTime() throws Exception {
		System.out.println("--------------Test--------------");
		System.out.println(dao.getTime());
		System.out.println("--------------------------------");
	}
}
