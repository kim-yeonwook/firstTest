package com.dogdrip.web.user.repository;

import java.util.List;

import com.dogdrip.web.user.model.UserVO;

public interface IUserMapper {
	
	void signUpUser(UserVO vo);
	
	UserVO selectOne(String userId);
	
	List<UserVO> selectAll();
	
	void delete(String userId);
	
	Integer checkId(String userId);
}
