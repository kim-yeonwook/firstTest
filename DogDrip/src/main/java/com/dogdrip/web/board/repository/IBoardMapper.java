package com.dogdrip.web.board.repository;

import java.util.List;

import com.dogdrip.web.board.model.BoardVO;

public interface IBoardMapper {
	
	void insert(BoardVO article);
	
	void delete(Integer boardNo);
	
	void update(BoardVO article);
	
	BoardVO getArticle(Integer boardNo);
	
	void updateViewCnt(Integer boardNo);
	
	List<BoardVO> getArticleList();
	
	//Integer countArticles(SearchVO search);
	

}
