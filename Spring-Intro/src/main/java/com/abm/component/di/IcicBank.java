package com.abm.component.di;

import org.springframework.stereotype.Component;

@Component("icic")
public class IcicBank implements Bank {

	public void withdraw(int atmid, int acno, double amount) {
	 System.out.println("user of Icicbank waiting ");
		
	}
	
	

}
