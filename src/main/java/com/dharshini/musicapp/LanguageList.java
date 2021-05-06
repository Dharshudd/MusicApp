package com.dharshini.musicapp;

import java.util.ArrayList;

public class LanguageList {
	static ArrayList<String> languages = new ArrayList<String>();
	
	/**
	 * This static block adds available languages to array list
	 */
	static {
		languages.add("Tamil");
		languages.add("Hindi");
	}

	/**
	 * This method adds the available languages to the array list and displays
	 */
	public static void displayAvailableLanguage() {
		for (String list : languages) {
			System.out.println(list);
		}
	}
}