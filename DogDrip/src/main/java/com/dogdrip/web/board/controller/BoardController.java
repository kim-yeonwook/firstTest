package com.dogdrip.web.board.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dogdrip.web.board.model.BoardVO;
import com.dogdrip.web.board.service.IBoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Inject
	IBoardService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		System.out.println("/board/list : GET");
		List<BoardVO> list = service.getArticleList();
		model.addAttribute("articles", list);
		
		return "board/list";
	}
	
	@GetMapping("/content/{boardNo}")
	public String content(@PathVariable Integer boardNo, Model model) {
		System.out.println("/board/content : GET");
		BoardVO vo = service.getArticle(boardNo);
		
		model.addAttribute("article", vo);
		
		return "board/content";
	}
	
	@GetMapping("/write")
	public String write(Model model,HttpSession session) {
		System.out.println("/board/write : GET");
		
		return "board/write";
	}
	
	@PostMapping("/write")
	public String write(BoardVO article, RedirectAttributes ra) {
		System.out.println("/board/write : POST");
		
		service.insert(article);
		ra.addFlashAttribute("msg", "success");
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/delete")
	public String delete(Integer boardNo, RedirectAttributes ra) {
		System.out.println("/board/delete : POST");
		
		service.delete(boardNo);
		ra.addFlashAttribute("msg", "success");
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/modify")
	public String modify(Model model,Integer BoardNo) {
		System.out.println("/board/modify : GET");
		
		BoardVO vo = service.getArticle(BoardNo);
		model.addAttribute("article", vo);
		
		return "board/modify";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO article, RedirectAttributes ra) {
		System.out.println("/board/modify : POST");
		
		service.update(article);
		ra.addFlashAttribute("msg", "success");
		
		return "redirect:/board/content"+article.getBoardNo();
	}
	
}