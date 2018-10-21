package com.promod.codefun;

import java.util.Scanner;

public class Test1 {

	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
	 int x;
		do {
		  x=0;
		int a=scan.nextInt();
		if(a!=42){
			x=1;
		}
		System.out.println(a);	
		}while(x>0);
		
	}
}
