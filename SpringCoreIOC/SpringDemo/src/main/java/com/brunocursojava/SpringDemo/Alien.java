package com.brunocursojava.SpringDemo;

public class Alien 
{
	private int age;
	private Computer com;

	public Alien() {
		System.out.println("Alien Object Created...");
	}

	
	/*trecho a seguir no spring.xml
	 * <constructor-arg value="12"></constructor-arg>
	 */
//	public Alien(int age) {
//		super();
//		this.age = age;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
	}
	
	

	public Computer getCom() {
		return com;
	}


	public void setCom(Computer com) {
		this.com = com;
	}


	public void code() {
		System.out.println("Im Coding...");
		com.compile();
	}
}
