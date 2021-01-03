package com.dogdrip.web.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dogdrip.web.user.model.UserVO;
import com.dogdrip.web.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;

	
	@GetMapping("signin")
	public String signIn() {
		System.out.println("/user/signin : GET");
		
		return "users/signin";
	}
	
	@PostMapping("signin")
	public String signIn(UserVO vo, HttpSession session,
							Model model) {
		System.out.println("/user/signin : POST");
		String result = null;
		
		UserVO dbData = service.selectOne(vo.getUserId());
		session.setAttribute("signIn", dbData);
		
		if(dbData != null) {
			if(vo.getPassword() == dbData.getPassword()) {
				result = "signSuccess";
			
			}else {
				result = "passwordFail";
			}
		}else {
			result = "idFail";
		}
		model.addAttribute("msg", result);
		
		return "board/home";
	}
	
	@GetMapping("signup")
	public String signUp() {
		System.out.println("/user/signup : GET");
		
		return "user/signup";
	}
	
	@PostMapping("signup")
	public String signUp(UserVO vo) {
		System.out.println("/user/signup : POST");
		
		service.signUpUser(vo);
		return "user/login";
	}
	
}
