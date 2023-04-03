package com.inhatc.domain;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class myBatisTest {
	@Inject
	private SqlSessionFactory sqlfactory;
	
	public void testFactory() {
		System.out.println(sqlfactory);
	}
	
	@Test
	public void testSession() throws Exception {
		try (SqlSession session = sqlfactory.openSession()) {
			System.out.println(session);
		} catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
}
