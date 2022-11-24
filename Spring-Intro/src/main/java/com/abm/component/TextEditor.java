package com.abm.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEdtr")

public class TextEditor {
	
	@Autowired  //DI
	private SpeelChecker sp;
	
	public void loadDocument(String document) {
		System.out.println("text editor loaded " + document);
		//SpeelChecker sp = new SpeelChecker();
		sp.checkSpellingMistake(document);
	}

}
