package com.inhatc.persistence;

import com.inhatc.domain.Members_vo;

public interface members_DAO {
	
	public String getTime();
	
	public void insertMember(Members_vo vo);
}
