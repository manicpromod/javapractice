package com.promod.codefun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String args[]) throws IOException{
		
		GetPlanFactory gpf = new GetPlanFactory();
		System.out.println("Enter the name of the plan");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		System.out.println("Enter the units");
		int units = br.read();
		Plan p = gpf.getPlan(planName);
		
		
		p.getRate();
		p.Calculatebill(units);
		
		
	}
}
