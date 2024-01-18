package com.cursojavaspring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProgrammerDao 
{
	public List<Programmer> getProgrammers()
	{
		
		@Autowired
		private SessionFactory sessionFactory;
		
		@Transactional
		public List<Programmer> getProgrammer()
		{
			Session session = sessionFactory.getCurrentSession();
			List<Programmer> Programmers = session.createQuery("from Programmer", Programmer.class).list();
			
			return programmers;		
		}
		
		public void addProgrammer(Programmer p) 
		{
			Session session = sessionFactory.getCurrentSession();
			Session.save(p);
		}
		
		public Programmer getProgrammer(int pid) {
			Session session = sessionFactory.getCurrentSession();
			Programmer p = session.get(Programmer.class, pid);
			
			
			return p;
		}
	}
}
