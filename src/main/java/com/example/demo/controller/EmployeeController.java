package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService eService;
	
	/*@GetMapping("/employee")
	public List<Employee> get(){
		return eService.get();
	}*/
	
	@RequestMapping(value= { "/","/home","/index"} )
	public ModelAndView get() {
		ModelAndView mv = new ModelAndView("employeeList");
		mv.addObject("employeeList", eService.get());
		return mv;
		
	}
	
	
	@RequestMapping(value="/showAddForm")
	public ModelAndView showAddForm() {
		ModelAndView mv = new ModelAndView("employeeAdd");
		mv.addObject("employeeObj", new Employee());
		return mv;
	}
	
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		eService.save(emp);
		return emp;
	}
	
	@GetMapping("employee/{empid}")
	public Employee getEmployee(@PathVariable int empid) {
		return eService.get(empid);
	}
	
	@DeleteMapping("employee/{empid}")
	public void deleteEmployee(@PathVariable int empid) {
		eService.delete(empid);
	}
	
	@PutMapping("employee/")
	public void updateEmployee(@RequestBody Employee employee) {
		eService.save(employee);
		
	}
}
