package com.promod.codefun;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Address {
	private BigDecimal value;
	
	public Address() {};									 
	public Address(BigDecimal value) {							 
		this.value = value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = new BigDecimal(value);						 
	}

	public BigDecimal getDollars() {
		return value.setScale(0, RoundingMode.FLOOR);					 
	}
	
	public BigDecimal getCents() {
		return value.subtract(getDollars());						 
	}

	public Address multiplyBy(BigDecimal value) {
		return new Address(value.multiply(value).setScale(2, RoundingMode.HALF_UP)); 	
	}
	
	public String toString() {
		return value.toString();
	}
}
