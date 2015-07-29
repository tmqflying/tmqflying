package com.tmqflying.manager.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <b>HomeController</b><br>
 *
 * @desc Describe here.
 * @author maoqitao
 * @date 2015年7月28日 下午4:53:27
 */
@Controller
public class HomeController {
	
	@RequestMapping("articles.html")
	public ModelAndView articles() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/articles");
		return mv;
	}
	@RequestMapping("books.html")
	public ModelAndView books() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/books");
		return mv;
	}
	@RequestMapping("technical.html")
	public ModelAndView technical() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/technical");
		return mv;
	}
}
