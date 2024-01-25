package com.cursojavaspring.mvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cursojavaspring.mvc.model.Programmer;

public interface ProgrammerRepo extends JpaRepository<Programmer, Integer>{

	//List<Programmer> findByPnameOrderByPid(String pname); // Query DSL

	@Query("from Programmer where pname= :name")
	List<Programmer> find(@Param("name") String pname);
	
}
