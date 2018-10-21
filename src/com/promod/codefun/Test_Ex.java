package com.promod.codefun;
import java.io.*;
import java.util.Scanner;

public class Test_Ex {

	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		File file = new File("C:/Users/Promod/workspace/JavaPractice/src/com/promod/codefun/test.txt");
		
		FileInputStream fo = new FileInputStream(file);
		
		System.out.println(fo);
		
	}
}
