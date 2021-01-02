package com.dogdrip.web.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogdrip.web.user.model.UserVO;
import com.dogdrip.web.user.repository.IUserMapper;

@Service
public class UserService implements IUserService {
	
	@Autowired
	IUserMapper mapper;

	@Override
	public void signUpUser(UserVO vo) {
		mapper.signUpUser(vo);

	}

	@Override
	public UserVO selectOne(String userId) {
		
		return mapper.selectOne(userId);
	}

	@Override
	public List<UserVO> selectAll() {
		
		return mapper.selectAll();
	}
	
	@Override
	public void delete(String userId) {
		mapper.delete(userId);
		
	}
	
	@Override
	public Integer checkId(String userId) {
		
		return mapper.checkId(userId);
	}

}
