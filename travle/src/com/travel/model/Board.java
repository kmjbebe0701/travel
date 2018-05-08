package com.travel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



public class Board implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer no;			//게시판 번호 (자동증가)
	private String title;		//게시판 제목 
	private String content;		//게시판 내용
	private Integer userNo;		//게시판 작성 유저 번호
	private Date regdate;		//게시물 등록일 
	private List<String> attachment;	// 게시물에 포함되는 사진 및 파일
	private Integer starValue;	// 별점 
	private Users user;			// 사용자 정보
	
	public Board() {}

	public Board(Integer no, String title, String content, Integer userNo, Date regdate, List<String> attachment,
			Integer starValue, Users user) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.userNo = userNo;
		this.regdate = regdate;
		this.attachment = attachment;
		this.starValue = starValue;
		this.user = user;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getUserNo() {
		return userNo;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public List<String> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<String> attachment) {
		this.attachment = attachment;
	}

	public Integer getStarValue() {
		return starValue;
	}

	public void setStarValue(Integer starValue) {
		this.starValue = starValue;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((regdate == null) ? 0 : regdate.hashCode());
		result = prime * result + ((starValue == null) ? 0 : starValue.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((userNo == null) ? 0 : userNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(!(obj instanceof Board)) return false;
		Board other = (Board) obj;
		if(this.no.equals(other.no)) return true;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [no=");
		builder.append(no);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content=");
		builder.append(content);
		builder.append(", userNo=");
		builder.append(userNo);
		builder.append(", regdate=");
		builder.append(regdate);
		builder.append(", attachment=");
		builder.append(attachment);
		builder.append(", starValue=");
		builder.append(starValue);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
