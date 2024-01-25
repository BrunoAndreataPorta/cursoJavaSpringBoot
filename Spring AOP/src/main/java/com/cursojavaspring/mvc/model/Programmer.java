package com.cursojavaspring.mvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Programmer {
	@Id
	private int pid;
	private String pname;
	
	public Programmer() {}
	
	public Programmer(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Programmer [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
}

