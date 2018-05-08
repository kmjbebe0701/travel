package com.travel.model;

import java.io.Serializable;
import java.util.List;

public class Spot implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private Integer spotNo;		//스팟에 대한 고유번호  (자동증가)
	private String name;		//스팟 이름
	private String address;		//스팟 주소
	private String local;		// 지역별 스팟을 나누는 기준
	private String division;	// 분류 ( ex: 축제, 문화유산 ,맛집..)
	private List<String> attachment;	//여러장의 스팟 사진들
	private List<Board> boardList;	// 스팟에 대해 작성된 리스트 
	
	public Spot() {}

	public Spot(Integer spotNo, String name, String address, String local, String division, List<String> attachment,
			List<Board> boardList) {
		super();
		this.spotNo = spotNo;
		this.name = name;
		this.address = address;
		this.local = local;
		this.division = division;
		this.attachment = attachment;
		this.boardList = boardList;
	}

	public Integer getSpotNo() {
		return spotNo;
	}

	public void setSpotNo(Integer spotNo) {
		this.spotNo = spotNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public List<String> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<String> attachment) {
		this.attachment = attachment;
	}

	public List<Board> getBoardList() {
		return boardList;
	}

	public void setBoardList(List<Board> boardList) {
		this.boardList = boardList;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + ((boardList == null) ? 0 : boardList.hashCode());
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((spotNo == null) ? 0 : spotNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Spot)) return false;
		Spot other = (Spot) obj;
		if(this.spotNo.equals(other.spotNo)) return true;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Spot [spotNo=");
		builder.append(spotNo);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", local=");
		builder.append(local);
		builder.append(", division=");
		builder.append(division);
		builder.append(", attachment=");
		builder.append(attachment);
		builder.append(", boardList=");
		builder.append(boardList);
		builder.append("]");
		return builder.toString();
	}
	
	
}
