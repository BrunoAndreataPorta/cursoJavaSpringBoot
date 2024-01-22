package com.cursojavaspring.mvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cursojavaspring.mvc.model.Programmer;

@Controller
public class HomeController 
{
	@Autowired
	ProgrammerRepo repo;
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Programmers");
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String home()
	{
		return "index";
	}
	
	@GetMapping("getProgrammers")
	public String getProgrammers(Model m)
	{
		m.addAttribute("result", repo.findAll());
		
		return "showProgrammers";
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int pid, Model m)
	{
		m.addAttribute("result", repo.getOne(pid));
		
		return "showProgrammers";
		
	}
	
	@PostMapping(value="addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer p)
	{		
		repo.save(p);
		return "result";
	}

}