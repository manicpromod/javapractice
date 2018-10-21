package com.promod.codefun;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringEx {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int index = scan.nextInt();
        String S1= scan.nextLine();
            String[] strArray1 = new String[] {S1}; 
        String S2= scan.nextLine();
         String[] strArray2 = new String[] {S2}; 
         
        for(int i=0;i<strArray1.length-1;i=i+2){
            System.out.println(strArray1[i]);
        }
        
         for(int i=1;i<strArray2.length-1;i=i+2){
            System.out.println(strArray2[i]);
        }
        
    }
}