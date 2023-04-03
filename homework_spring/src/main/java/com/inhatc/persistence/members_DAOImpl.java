package com.inhatc.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.Members_vo;

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

	@Override
	public void insertMember(Members_vo vo) {
		sqlsession.insert(namespace+".insertMembers",vo);
		//sqlsession.insert�� namespace�ȿ� �ִ� insertMember�� �ִ� �Ķ���� �� vo�� �Ѱ��ش�.		
	}
	
	
	
}
