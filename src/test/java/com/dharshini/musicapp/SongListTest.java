package com.dharshini.musicapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SongListTest {
	boolean isValidMovie;

	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test() {
		String inputMovie = "Dil BechaRa";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertTrue(isValidMovie);
	}

	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test1() {
		String inputMovie = "Gully Boy";
		isValidMovie = SongsList.chooseMovie(inputMovie);

	}

	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test2() {
		String inputMovie = "Namma Veetu Pillai";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertTrue(isValidMovie);
	}

	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test3() {
		String inputMovie = "Uthamaputhiran";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertTrue(isValidMovie);
	}

	/**
	 * This method tests whether the input movie is valid or not and displys the
	 * list of songs
	 */
	@Test
	public void test4() {
		String inputMovie = "Dil";
		isValidMovie = SongsList.chooseMovie(inputMovie);
		assertTrue(isValidMovie);
	}
}
