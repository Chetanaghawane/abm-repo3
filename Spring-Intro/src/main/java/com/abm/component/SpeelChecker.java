package com.abm.component;

import org.springframework.stereotype.Component;

@Component("splChckr")

public class SpeelChecker {
	
	public void checkSpellingMistake(String document) {
		System.out.println("spell checker execute for " + document);
	}

}
