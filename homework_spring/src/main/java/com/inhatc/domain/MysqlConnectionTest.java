package com.inhatc.domain;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.mysql.cj.jdbc.Driver;

public class MysqlConnectionTest {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL ="jdbc:mysql://127.0.0.1:3306/basicboard?serverTimezone=UTC&characterEncoding=UTF-8&useSSL=false";
	private static final String id = "root";
	private static final String passwd = "inhatc";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		
		try (Connection conn = DriverManager.getConnection(URL,id,passwd)){
			System.out.println(conn);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
