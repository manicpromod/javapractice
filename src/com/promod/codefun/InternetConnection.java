package com.promod.codefun;

import java.net.*;

public class InternetConnection {

	public static void main(String args[]){
		
		try{
			
			URL url = new URL("http://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			System.out.println("Internet is connected");
		}catch(Exception e){
			
			System.out.println("no internet connection");
		}
	}
}
