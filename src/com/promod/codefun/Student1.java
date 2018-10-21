package com.promod.codefun;

public class Student1 {

	
	public static void main(String args[]){
		
		/*
		Student st = new Student();
		st.setId(1);
		st.setName("Promod");
		st.setSubject("Java");
		
		//System.out.println("ID value is "+ st.getId() + " Name is "+ st.getName() );
		
		st.display();
		
		*/
		
		Student st1 = new Student(1,"Promod","Java");
		Student st2 = new Student(1,"Peter","Oracle");
		
		st1.display();
		st2.display();
				
	}
}
