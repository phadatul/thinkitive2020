package com.thinkitive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyClass {
	@Autowired
	Calculator calculator;

	@RequestMapping(value = "/hi", method = RequestMethod.POST)
	public ModelAndView bye(@RequestParam("username") String user, @RequestParam("password") String pass) {
		System.out.println("Hello world");

		ModelAndView model = new ModelAndView();
		model.addObject("message", "THIS IS SAMPLE DATA");
		model.setViewName("welcome.jsp");
		return model;
	}

	@RequestMapping(value = "/add")
	public ModelAndView myadd(Integer a, Integer b) {
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome.jsp");
		model.addObject("message","Answer is:"+calculator.add(a, b));
		return model;

	}
}
