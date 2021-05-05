package com.dharshini.musicapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MovieTest {
	boolean isExist;

	/**
	 * This method checks whether the input language is valid or not
	 */
	@Test
	public void testCase1() {
		String inputLanguage = "tamil";
		isExist = MovieList.chooseLanguage(inputLanguage);
		assertTrue(isExist);
	}

	/**
	 * This method checks whether the input language is valid or not
	 */
	@Test
	public void testCase2() {
		String inputLanguage = "Hindi";
		isExist = MovieList.chooseLanguage(inputLanguage);
		assertTrue(isExist);

	}

	/**
	 * This method checks whether the input language is valid or not
	 */
	@Test
	public void testCase3() {
		String inputLanguage = "English";
		isExist = MovieList.chooseLanguage(inputLanguage);
		assertTrue(isExist);
	}
}
