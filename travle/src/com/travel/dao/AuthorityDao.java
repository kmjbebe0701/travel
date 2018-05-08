package com.travel.dao;

import com.travel.model.Authority;
import com.travel.model.UsersException;


public interface AuthorityDao 
{
	public Authority select(Integer id) throws UsersException;
}
