package com.dogdrip.web.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
							Model model, RedirectAttributes ra) {
		System.out.println("/user/signin : POST");
		
		UserVO dbData = service.selectOne(vo.getUserId());
		session.setAttribute("signIn", dbData);
		
		if(dbData != null) {
			if(vo.getPassword() == dbData.getPassword()) {
			
			}else {
				ra.addFlashAttribute("msg", "passwordFail");
				return "redirect:/board/login";
			}
		}else {
			ra.addFlashAttribute("msg", "idFail");
			return "redirect:/board/login";
		}
		ra.addFlashAttribute("msg", "signSuccess");
		return "redirct:/board/home";
	}
	
	@GetMapping("signup")
	public String signUp() {
		System.out.println("/user/signup : GET");
		
		return "users/signup";
	}
	
	@PostMapping("signup")
	public String signUp(@RequestBody UserVO user) {
		System.out.println("/user/signup : POST");
		String result = null;
		
		
		service.signUpUser(user);
		return result;
	}
	
	@PostMapping("checkid")
	public String checkId(@RequestBody String userId) {
		System.out.println("/user/checkid : POST");
		String result = null;
		
		if(service.checkId(userId) == 1) {
			System.out.println("아이디 중복됨");
			result = "idCheckFail";
		}else {
			System.out.println("아이디 사용가능");
			result = "idCheckSuccess";
		}
		
		return result;
	}
	
}
