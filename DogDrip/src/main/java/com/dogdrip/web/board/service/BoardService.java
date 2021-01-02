package com.dogdrip.web.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogdrip.web.board.model.BoardVO;
import com.dogdrip.web.board.repository.IBoardMapper;

@Service
public class BoardService implements IBoardService {
	
	@Autowired
	IBoardMapper mapper;

	@Override
	public void insert(BoardVO article) {
		

	}

	@Override
	public void delete(Integer boardNo) {
		

	}

	@Override
	public void update(BoardVO article) {
		

	}

	@Override
	public BoardVO getArticle(Integer boardNo) {
		
		return null;
	}
	
	@Override
	public void updateViewCnt(Integer boardNo) {
		
		
	}
	
	@Override
	public List<BoardVO> getArticleList() {
		
		return mapper.getArticleList();
	}

}
