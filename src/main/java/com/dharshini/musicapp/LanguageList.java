package com.dharshini.musicapp;

import java.util.ArrayList;

public class LanguageList {
	static ArrayList<String> languages = new ArrayList<String>();

	/**
	 * This method adds the available languages to the array list and displays
	 */
	public static void displayAvailableLanguage() {
		languages.add("Tamil");
		languages.add("Hindi");		
		
		for (String list : languages) {
			System.out.println(list);
		}
		System.out.println();
		
	}
	
}