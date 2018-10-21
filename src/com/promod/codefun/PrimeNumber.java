package com.promod.codefun;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number");
		int num = sc.nextInt();
		
		if((num%2==0) || (num%3==0)) {
			
			System.out.println(num+" The number is not a prime number");
		} else {
			System.out.println(num+" The number is a prime number");
			
		}
		
	}
}
