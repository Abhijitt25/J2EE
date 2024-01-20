package com.demo.controller;
import com.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.services.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService eserv;
	
	@GetMapping("/")
	public ModelAndView homepage() {
		
		return new ModelAndView("homepage");
		
	}
	
	
	@GetMapping("/addleave")
	public ModelAndView addleave() {
		
		return new ModelAndView("leave");
		
	}
	
	
	@PostMapping("/insertleave")
	public ModelAndView insertleave(@RequestParam int Empno, @RequestParam String Start_Date,@RequestParam String End_Date,@RequestParam String Leave_Type,@RequestParam String Leave_Reason) {
		Employee e=new Employee(Empno,Start_Date,End_Date ,Leave_Type, Leave_Reason);
		eserv.addleave(e);
		return new ModelAndView("redirect:/employee/homepage");
		
	}
	

}
