package com.travel.service;

import java.util.List;

import com.travel.model.Spot;

public interface SpotService {
	public void insert(Spot spot) ;			// 스팟 추가	
    public Spot select(Integer spotNo);		// 스팟 검색
    public void update(Spot spot);			// 스팟 수정 
    public void delete(Integer spotNo);		// 스팟 삭제
    public void deleteAll();				// 스팟 전체 삭제
	public List<Spot> selectAll();			// 스팟 전체 불러오기

}
