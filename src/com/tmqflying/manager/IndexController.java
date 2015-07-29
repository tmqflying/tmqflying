package com.tmqflying.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <b>IndexController</b><br>
 *
 * @desc Describe here.
 * @author maoqitao
 * @date 2015年7月29日 上午8:00:30
 */
@Controller
public class IndexController {
	@RequestMapping({"/","/index.html"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	

	
	@RequestMapping("/manager")
	public ModelAndView manager() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "welcome");
		mv.setViewName("manager");
		return mv;
	}
}
