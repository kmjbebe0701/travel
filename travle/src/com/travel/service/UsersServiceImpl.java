package com.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.travel.dao.AuthorityDao;
import com.travel.dao.UsersDao;
import com.travel.model.Users;



@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersDao usersDao;

	@Autowired
	private AuthorityDao authorityDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	

	@Override
	public List<Users> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users select(Integer no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users selectByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertAuthority(Users users) {
		// TODO Auto-generated method stub
		
	}

}
