package com.promod.codefun;

public class Student {

	private int id;
	private String name;
	private String subject;
	
	Student(int id ,String name,String subject){
		
		this.id=id;
		this.name=name;
		this.subject=subject;
		
	}
	
	public void setId(int id){
		
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		
		this.name=name;
	}
	public String getName(){
		
		return name;
	}
	
	public void setSubject(String subject){
		
		this.subject=subject;
	}
	public String getSubject(){
		
		return subject;
	}
	
	public void display(){
		
		System.out.println(getId() + getName() + getSubject());
	}
}
