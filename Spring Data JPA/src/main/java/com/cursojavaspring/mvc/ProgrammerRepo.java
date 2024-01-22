package com.cursojavaspring.mvc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaspring.mvc.model.Programmer;

public interface ProgrammerRepo extends JpaRepository<Programmer, Integer>{
	
}
