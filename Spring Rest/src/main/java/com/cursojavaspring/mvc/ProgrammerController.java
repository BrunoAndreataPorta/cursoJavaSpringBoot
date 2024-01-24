package com.cursojavaspring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursojavaspring.mvc.model.Programmer;

@RestController
public class ProgrammerController {
	
	@Autowired
	ProgrammerRepo repo;
	
	@GetMapping(path= "programmers", produces= {"application/xml"})
	public List<Programmer> getProgrammers()
	{
		List<Programmer> programmers =repo.findAll();
		
		return programmers ;
	}
	
	@GetMapping("programmer/{pid}")
	public Programmer getProgrammer(@PathVariable("pid") int pid)
	{
		Programmer programmer = repo.findById(pid).orElse(new Programmer(0, ""));
		
		return programmer;
	}
	
	@PostMapping(path = "programmer", consumes= {"application/json"})
	public Programmer addProgrammer(@RequestBody Programmer programmer)
	{
		repo.save(programmer);
		
		return programmer;
	}
}
