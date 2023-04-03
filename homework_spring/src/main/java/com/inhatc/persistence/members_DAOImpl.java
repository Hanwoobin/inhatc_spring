package com.inhatc.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class members_DAOImpl implements members_DAO{
	
	@Inject
	private SqlSession sqlsession;
	
	private static final String namespace = "com.inhatc.mapper.membersMapper";

	@Override
	public String getTime() {
		//.getTime mapper�� �ִ� getTime�� ����
		return sqlsession.selectOne(namespace + ".getTime");
	}
	
	
	
}
