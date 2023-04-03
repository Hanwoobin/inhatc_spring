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
		//.getTime mapper에 있는 getTime을 실행
		return sqlsession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMember(Members_vo vo) {
		sqlsession.insert(namespace+".insertMembers",vo);
		//sqlsession.insert에 namespace안에 있는 insertMember에 있는 파라미터 값 vo를 넘겨준다.		
	}
	
	
	
}
