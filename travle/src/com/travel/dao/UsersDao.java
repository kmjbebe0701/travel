package com.travel.dao;

import java.util.List;

import com.travel.model.Users;

public interface UsersDao 
{
	public List<Users> selectAll();		// 모든 유저 불러오기
	public Users select(Integer no);	// 특정 유저 불러오기
	public void insert(Users user);		// 유저 한명 저장하기
	public void delete(Integer no);		// 유저 번호로 삭제
	public void update(Users user);		// 유저 변경
	public Users selectByEmail(String email);	// 이메일로 유저 가져오기 
	public void insertAuthority(Users users);	// 권한 추가
}
