package com.thinkitive.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.thinkitive.dao.MyDataAccessObject;
import com.thinkitive.model.Employee;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView dbInsert(Integer empid, String ename, Integer salary) {
		ModelAndView model = new ModelAndView();
		MyDataAccessObject m = new MyDataAccessObject();
		m.addEmp(new Employee(empid, ename, salary));
		model.setViewName("success.jsp");
		return model;
	}

}
