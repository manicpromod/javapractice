package com.promod.codefun;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tipCost=(mealCost*20)/100;
        double taxCost=mealCost*(8/100);
            
        double result= mealCost+tipCost+taxCost;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(result);
      
        // Print your result
        
        System.out.println(totalCost);
        System.out.println(tipCost);
        System.out.println(taxCost);
    }
}
