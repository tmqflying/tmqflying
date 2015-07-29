package com.tmqflying.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
/**
 * <b>HelloWorldController</b><br>
 *
 * @desc Describe here.
 * @author maoqitao
 * @date 2015年7月28日 下午3:40:52
 */
public class HelloWorldController {

	@RequestMapping("/tmq")
	public ModelAndView hello() {
		String message = "Spring MVC 示例";
		return new ModelAndView("hello", "msg", message);
	}

}
