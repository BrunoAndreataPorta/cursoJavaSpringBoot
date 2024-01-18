package com.cursojavaspring.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Programmer {
	@Id
	private int pid;
	private String pname;
	
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

