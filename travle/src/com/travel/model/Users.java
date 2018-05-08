package com.travel.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;


public class Users implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Integer no;				// 회원번호 : 자동증가
	private String email;			// 회원 이메일: P값
	private String password;		// 회원 비밀번호
	private String name;			// 회원 이름
	private String phoneNum;		// 회원 전화번호 
	private List<Board> boardList;	// 회원이 작성한 게시판 리스트
	private Set<Authority> authority;	// 회원 등급 (어드민, 유저)
	
	public Users() {}

	public Users(Integer no, String email, String password, String name, String phoneNum, List<Board> boardList,
			Set<Authority> authority) {
		super();
		this.no = no;
		this.email = email;
		this.password = password;
		this.name = name;
		this.phoneNum = phoneNum;
		this.boardList = boardList;
		this.authority = authority;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public List<Board> getBoardList() {
		return boardList;
	}

	public void setBoardList(List<Board> boardList) {
		this.boardList = boardList;
	}

	public Set<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(Set<Authority> authority) {
		this.authority = authority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authority == null) ? 0 : authority.hashCode());
		result = prime * result + ((boardList == null) ? 0 : boardList.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Users)) return false;
		Users other = (Users) obj;
		if(this.no.equals(other.no)) return true;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Users [no=");
		builder.append(no);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", name=");
		builder.append(name);
		builder.append(", phoneNum=");
		builder.append(phoneNum);
		builder.append(", boardList=");
		builder.append(boardList);
		builder.append(", authority=");
		builder.append(authority);
		builder.append("]");
		return builder.toString();
	}
	
	
}
