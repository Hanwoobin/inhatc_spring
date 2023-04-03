package com.inhatc.domain;

import java.sql.Date;

public class Members_vo {
	private String user_id;
	private String userpw;
	private String user_name;
	private String email;
	private Date regdate;
	private Date updatedate;
	@Override
	public String toString() {
		return "Members_vo [user_id=" + user_id + ", userpw=" + userpw + ", user_name=" + user_name + ", email=" + email
				+ "]";
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
} 
