package com.promod.codefun;

public abstract class Plan {

	public double rate;
	public abstract void getRate();
	
	public void Calculatebill(int units){
		System.out.println(units*rate);
	}
}
