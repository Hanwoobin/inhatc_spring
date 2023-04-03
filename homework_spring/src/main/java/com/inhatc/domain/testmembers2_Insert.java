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

public class testmembers2_Insert {
	
	@Inject
	private members_DAO dao;
	
	@Test
	public void testTime() throws Exception {
		
		Members_vo vo = new Members_vo();
		vo.setUser_id("test1");
		vo.setUser_name("Tester");
		vo.setUserpw("test");
		vo.setEmail("Tester1@naver.com");
		dao.insertMember(vo);
	}
}
