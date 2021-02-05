package com.thinkitive;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	EmpRepo repo = new EmpRepo();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello world";
	}

	@GetMapping(value = "/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id) {

		System.out.println(id);
		return repo.getEmployee(id);
	}

	@GetMapping(value = "/all")
	public List<Employee> getEmployee() {

		return repo.getAll();
	}

	@PostMapping(value = "/save")
	public Employee insertEmployee(@RequestBody Employee e) {
		System.out.println(e);
		repo.insert(e);
		return e;
	}

	@PutMapping(value = "/update")
	public Employee update(@RequestBody Employee e) {
		System.out.println(e);
		repo.update(e);
		return e;
	}

	@DeleteMapping(value = "/delete")
	public Employee delete(@RequestBody Employee e) {
		repo.delete(e);
		System.out.println(e);
		return e;
	}

}
