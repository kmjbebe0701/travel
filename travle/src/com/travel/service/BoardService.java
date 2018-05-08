package com.travel.service;

import java.util.List;

import com.travel.model.Board;

public interface BoardService {
	 public void insert(Board board) ;	//글 추가
	    public Board select(String no);		// 글 찾기
	    public List<Board> selectAll(); 	// 모든글 긁어오기 
	    public void update(Board board);	// 글 업데이트
	    public void delete(String no);		// 글 삭제
	    public void deleteAll();			//글 전체 삭제

}
