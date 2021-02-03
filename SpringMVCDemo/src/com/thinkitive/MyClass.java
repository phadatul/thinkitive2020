package com.thinkitive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyClass {

	@RequestMapping(value = "/hi",method=RequestMethod.GET)
	public String hello() {
		System.out.println("Hello world");
		return "welcome.jsp";
	}
}
