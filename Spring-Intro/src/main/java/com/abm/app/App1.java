package com.abm.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.Calculator;
import com.abm.component.Demo;
import com.abm.component.TextEditor;
import com.abm.component.di.Atm;
import com.abm.component.di.HdfcAtm;

public class App1 {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		Demo dm = (Demo) ctx.getBean("demo");
		System.out.println(dm.sayDemo("Class"));
		
		Calculator c = (Calculator) ctx.getBean("calc");
		c.add(4, 7);
		c.sub(5, 3);
		
		TextEditor te = (TextEditor) ctx.getBean("txtEdtr");
		te.loadDocument("abc.txt");
		
		Atm h = (Atm) ctx.getBean("hdfc");
		h.withdraw(111111, 2000);
	}

}
