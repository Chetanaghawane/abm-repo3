package com.abm.component;

import org.springframework.stereotype.Component;

@Component("calc") //alternate to <bean id="cc" class="..calculator"
public class Calculator {
	
	public void add(int x, int y) {
		System.out.println(x+y);
		
	}
	
	public void sub(int x, int y) {
		System.out.println(x-y);
	}

}
