package com.inhatc.domain;

public class memberVO {
	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public memberVO(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}
