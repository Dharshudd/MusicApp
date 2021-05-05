package com.dharshini.musicapp;

import java.util.ArrayList;

public class MovieList {
	static ArrayList<String> tamilMovies = new ArrayList<String>();
	static ArrayList<String> hindiMovies = new ArrayList<String>();

	/**
	 * This method checks whether userInput language is in the available list of languages and
	 * calls the respective movie list displaying method 
	 * according to the appropriate input language
	 * @param inputLanguage
	 */
	public static boolean chooseLanguage(String inputLanguage) {
		boolean isValidLanguage=false;
		if(inputLanguage.equalsIgnoreCase("Tamil")){
			tamilMovieList();
			isValidLanguage=true;
		}
		else if(inputLanguage.equalsIgnoreCase("Hindi")){
			hindiMovieList();
			isValidLanguage=true;
		}
		else {
			System.out.println("Invalid Language Choice");
		}
		return isValidLanguage;
	}
	
	/**
	 * Displays the list of movies available in Tamil language
	 */
	public static void tamilMovieList() {
		System.out.println("Available Tamil Movies List");
		System.out.println("---------------------------");
		tamilMovies.add("Namma Veetu Pillai");
		tamilMovies.add("Uthamaputhiran");
		for (String movies : tamilMovies) {
			System.out.println(movies);
		}
		System.out.println();
	}
	
	/**
	 * Displays the list of movies available in Hindi Language
	 */
	public static void hindiMovieList() {
		System.out.println("Available Hindi Movies List");
		System.out.println("---------------------------");
		hindiMovies.add("Dil Bechara");
		hindiMovies.add("Gully Boy");
		for (String movies : hindiMovies) {
			System.out.println(movies);
		}
	System.out.println();
	}
}
