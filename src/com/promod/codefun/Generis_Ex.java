package com.promod.codefun;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generis_Ex {
	
	public static void main(String args[]){
		
		List ar_list = new ArrayList(); 
		
		ar_list.addAll(new LinkedList());
		ar_list.add(1); 
		System.out.println("Got the name");	
		try{
			FileInputStream fi =new FileInputStream("test11.txt");
			
		}catch(Exception e) {
			
			System.out.println("File not found execption has occured");	
		}
		
		
	}
	

}
