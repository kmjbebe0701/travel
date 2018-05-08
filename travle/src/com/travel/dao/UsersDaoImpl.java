package com.travel.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.travel.model.Users;

@Repository
public class UsersDaoImpl implements UsersDao{

	@Override
	public List<Users> selectAll() {
		return null;
	}

	@Override
	public Users select(Integer no) {
		return null;
	}

	@Override
	public void insert(Users user) {
		
	}

	@Override
	public void delete(Integer no) {
		
	}

	@Override
	public void update(Users user) {
		
	}

	@Override
	public Users selectByEmail(String email) {
		return null;
	}

	@Override
	public void insertAuthority(Users users) {
		
	}

}
