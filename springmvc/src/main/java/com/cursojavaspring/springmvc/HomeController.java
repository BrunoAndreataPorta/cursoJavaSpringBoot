package com.cursojavaspring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cursojavaspring.mvc.model.Programmer;

@Controller
public class HomeController 
{
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Programadores");
	}
	
	@RequestMapping(value="/springmvc/", method=RequestMethod.GET)
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, Model m)
	{
		
		int num3 = i + j;
		m.addAttribute("num3", num3);
		
		return "result";
	}
	
	@RequestMapping("addProgrammer")
	public String addProgrammer(@ModelAttribute("p1") Programmer p)
	{		
		return "result";
	}

}