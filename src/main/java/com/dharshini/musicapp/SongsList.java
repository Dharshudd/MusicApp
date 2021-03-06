package com.dharshini.musicapp;

import java.util.ArrayList;

public class SongsList {
	static ArrayList<String> nammaVeetuPillaiSongs = new ArrayList<String>();
	static ArrayList<String> uthamaPuthiranSongs = new ArrayList<String>();
	static ArrayList<String> dilBecharaSongs = new ArrayList<String>();
	static ArrayList<String> gullyBoySongs = new ArrayList<String>();

	/**
	 * This method checks whether the user input movie is available in the list and
	 * calls the respective method to display the songs list
	 * 
	 * @param inputMovie
	 * @return isExistMovie
	 */
	public static boolean chooseMovie(String inputMovie) {
		boolean isExistMovie = false;
		if (inputMovie.equalsIgnoreCase("Namma Veetu Pillai")) {
			displayNammaVeetuPillaiSongs();
			isExistMovie = true;
		} else if (inputMovie.equalsIgnoreCase("Uthamaputhiran")) {
			uthamaputhiranSongs();
			isExistMovie = true;
		} else if (inputMovie.equalsIgnoreCase("Dil Bechara")) {
			displayDilBecharaSongs();
			isExistMovie = true;
		} else if (inputMovie.equalsIgnoreCase("Gully Boy")) {
			displayGullyBoySongs();
			isExistMovie = true;

		}
		return isExistMovie;
	}

	/**
	 * This method adds the list of songs in arraylist and displays them
	 */
	public static void displayNammaVeetuPillaiSongs() {
		nammaVeetuPillaiSongs.add("GaandaKannazhagi");
		nammaVeetuPillaiSongs.add("Jigiri Dosthu");
		nammaVeetuPillaiSongs.add("Mailaanji");
		nammaVeetuPillaiSongs.add("Un Koodavae Porakanum");
		nammaVeetuPillaiSongs.add("Yenakkaagavae Poranthavalaey");
		nammaVeetuPillaiSongs.add("Yenga Annan");
		System.out.println("List of Songs in Namma Veetu Pillai");
		System.out.println("-----------------------------------");
		for (String songs : nammaVeetuPillaiSongs) {
			System.out.println(songs);
		}
	}

	/**
	 * This method adds the list of songs in arraylist and displays them
	 */
	public static void uthamaputhiranSongs() {
		uthamaPuthiranSongs.add("Kan Irandil");
		uthamaPuthiranSongs.add("Idicha Pacharisi");
		uthamaPuthiranSongs.add("Ussumu Laresay");
		uthamaPuthiranSongs.add("En Nenju");
		uthamaPuthiranSongs.add("Thooral Thedum");
		uthamaPuthiranSongs.add("Ulagam Unaku");
		System.out.println("List of Songs in Uthamaputhiran");
		System.out.println("-------------------------------");
		for (String songs : uthamaPuthiranSongs) {
			System.out.println(songs);
		}
	}

	/**
	 * This method adds the list of songs in arraylist and displays them
	 */
	public static void displayDilBecharaSongs() {
		dilBecharaSongs.add("Dil Bechara");
		dilBecharaSongs.add("Main Tumhara");
		dilBecharaSongs.add("Mera Naam Kizie");
		dilBecharaSongs.add("Friendzone");
		dilBecharaSongs.add("Khulke Jeene Ka");
		dilBecharaSongs.add("Taare Ginn");
		System.out.println("List of Songs in Dil Bechara");
		System.out.println("-----------------------------------");
		for (String songs : dilBecharaSongs) {
			System.out.println(songs);
		}
	}

	/**
	 * This method adds the list of songs in arraylist and displays them
	 */
	public static void displayGullyBoySongs() {
		gullyBoySongs.add("Apna Time Aayega");
		gullyBoySongs.add("Ek Hee Raasta");
		gullyBoySongs.add("Mere Gully Mein");
		gullyBoySongs.add("En Nenju");
		gullyBoySongs.add("Asli Hip Hop");
		gullyBoySongs.add("Doori Poem");
		System.out.println("List of Songs in Gully Boy");
		System.out.println("-------------------------------");
		for (String songs : gullyBoySongs) {
			System.out.println(songs);
		}
	}

}