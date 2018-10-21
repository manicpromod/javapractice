package com.promod.codefun;

import java.util.Scanner;

//Test Employee class invokes the Emp Query Method
public class Test_Employee {

	public static void main(String args[]){
		
		String First_Name;
		int EmpID;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EmpID ");
		EmpID=sc.nextInt();
		System.out.println("Enter the FirstName ");
		First_Name=sc.next();
		
		StringBuilder query;
		
		try{
			System.out.println("Query is return as " + create_query(EmpID,First_Name));
			
		}catch (Exception e){
			
			System.out.println("Exception in calling the method" );
			e.printStackTrace();
			
		}
			
	
	}
	
	//This method returns the query for the Employee table based on EmpID and First_Name
	
	public static  StringBuilder  create_query(int EmpID ,String First_Name) {

		     StringBuilder sf=new StringBuilder();
		     
		     sf=sf.append("SELECT ")
		     	.append("EMPID")
		     	.append(",")
		     	.append("First_Name")
		     	.append(",")
		     	.append("Middle_Name")
		     	.append(" FROM")
		     	.append(" Employee")
		     	.append(" WHERE")
		     	.append(" EmpID")
		     	.append("= ")
		     	.append(EmpID)
		     	.append(" AND")
		     	.append(" First_Name")
		     	.append("= ")
		     	.append(First_Name)
		     	.append(";");
		  
			return sf;
		}

}
