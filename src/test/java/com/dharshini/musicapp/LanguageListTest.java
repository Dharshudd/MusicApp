package com.dharshini.musicapp;

import org.junit.Test;

public class LanguageListTest {

	/**
	 * This method is used to display the list of available languages in console 
	 */
	@Test
	public void test() {
		System.out.println("Displaying Available Languages");
		System.out.println("------------------------------");
		LanguageList.displayAvailableLanguage();
	}
}
