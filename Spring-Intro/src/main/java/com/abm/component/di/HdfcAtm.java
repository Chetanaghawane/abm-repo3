package com.abm.component.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfc")

public class HdfcAtm implements Atm {
	
	@Autowired
	private Bank bank;

	public void withdraw(int acno, double amount) {
		
		System.out.println("User at Hdfc Atm waiting " + amount );
		bank.withdraw(121, 111111, 2000);
		
		
	}

}
