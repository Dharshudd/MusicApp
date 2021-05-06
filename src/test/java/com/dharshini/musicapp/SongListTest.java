package com.dharshini.musicapp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SongListTest {
	boolean isValidMovie;

	/**
	 * This method tests whether the input movie is valid or not and displays the
	 * list of songs
	 */
	@Test
	public void test() {
		String inputMovie = "Dil BEcHaRa";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertTrue(isValidMovie);
	}
	
	/**
	 * This method tests whether the input movie is valid or not and displays the
	 * list of songs
	 */
	@Test
	public void test1() {
		String inputMovie = "Dil Bechara";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertTrue(isValidMovie);
	}

	/**
	 * This method tests whether the input movie is valid or not and displays the
	 * list of songs
	 */
	@Test
	public void test2() {
		String inputMovie = "Gully Boy";
		isValidMovie = SongsList.chooseMovie(inputMovie);

	}

	/**
	 * This method tests whether the input movie is valid or not and displays the
	 * list of songs
	 */
	@Test
	public void test3() {
		String inputMovie = "Namma Veetu Pillai";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertTrue(isValidMovie);
	}

	/**
	 * This method tests whether the input movie is valid or not and displays the
	 * list of songs
	 */
	@Test
	public void test4() {
		String inputMovie = "Uthamaputhiran";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertTrue(isValidMovie);
	}

	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test5() {
		String inputMovie = "Dil";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertFalse(isValidMovie);
	}
	
	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test6() {
		String inputMovie = "";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertFalse(isValidMovie);
	}
	
	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test7() {
		String inputMovie = "1D";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertFalse(isValidMovie);
	}
	
	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test8() {
		String inputMovie = "$yiu";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertFalse(isValidMovie);
	}
	
	@Test
	public void test9() {
		String inputMovie = null;
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertFalse(isValidMovie);
	}
}
