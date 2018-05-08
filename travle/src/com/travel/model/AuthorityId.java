package com.travel.model;

public enum AuthorityId 
{
	ADMIN(10),
	USER(20);
	private  Integer id;
	private AuthorityId(Integer id) {
		this.id=id;
	}
	private Integer getId() {
		return id;
	}
}
