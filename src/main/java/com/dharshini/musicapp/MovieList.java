package com.dharshini.musicapp;

import java.util.ArrayList;

public class MovieList {
	static ArrayList<String> tamilMovies = new ArrayList<String>();
	static ArrayList<String> hindiMovies = new ArrayList<String>();

	/**
	 * This method validates input string for only alphabets and not null or empty spaces
	 * 
	 * @param inputLanguage
	 * @return
	 */
	public static boolean stringValidator(String inputLanguage) {
		boolean isValid = true;
		// String symbols = "!@#$%^&*()_+-={}|[]:;'/?.<>,~`";
		// for (int iterator = 0; iterator < inputLanguage.length(); iterator++) {
		//inputLanguage = inputLanguage.trim();
		if (inputLanguage == null || inputLanguage.trim().equals("") || inputLanguage.trim().matches("[^A-Za-z]")) {
			isValid = false;
		}
		// }
		return isValid;
	}

	/**
	 * This static block adds tamil movies to array list
	 */
	static {
		tamilMovies.add("Namma Veetu Pillai");
		tamilMovies.add("Uthamaputhiran");
	}

	/**
	 * This static block adds Hindi movies to array list
	 * 
	 */
	static {
		hindiMovies.add("Dil Bechara");
		hindiMovies.add("Gully Boy");
	}

	/**
	 * This method checks whether userInput language is in the available list of
	 * languages and calls the respective movie list displaying method according to
	 * the appropriate input language
	 * 
	 * @param inputLanguage
	 */
	public static boolean chooseLanguage(String inputLanguage) {
		boolean isValidLanguage = false;
		// String Validation is done
		if (stringValidator(inputLanguage)) {
			if (inputLanguage.equalsIgnoreCase("Tamil")) {
				displayTamilMovieList();
				isValidLanguage = true;
			} else if (inputLanguage.equalsIgnoreCase("Hindi")) {
				displayHindiMovieList();
				isValidLanguage = true;
			} else {
				System.out.println("Invalid Language Choice");
				isValidLanguage = false;
			}
		}
		return isValidLanguage;
	}

	/**
	 * Displays the list of movies available in Tamil language
	 */

	private static void displayTamilMovieList() {
		System.out.println("Available Tamil Movies List");
		System.out.println("---------------------------");
		for (String movies : tamilMovies) {
			System.out.println(movies);
		}
		System.out.println();
	}

	/**
	 * Displays the list of movies available in Hindi Language
	 */

	private static void displayHindiMovieList() {
		System.out.println("Available Hindi Movies List");
		System.out.println("---------------------------");
		for (String movies : hindiMovies) {
			System.out.println(movies);
		}
		System.out.println();
	}

}
