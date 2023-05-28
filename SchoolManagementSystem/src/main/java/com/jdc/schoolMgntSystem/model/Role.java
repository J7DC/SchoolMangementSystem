package com.jdc.schoolMgntSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "role")
public class Role {
	
	
	// Java program to illustrate if-else-if ladder 
	 
		public static void main(String args[]) 
		{ 
			int i = 20; 
			Boolean n=false;
if(n){
			if (i == 10) 
				System.out.println("i is 10"); 
			else if (i == 15) 
				System.out.println("i is 15"); 
			else if (i == 20) 
				System.out.println("i is 20"); 
					} else{
						System.out.println("False");
					}
		}
}

	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Role() {
		
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
*/