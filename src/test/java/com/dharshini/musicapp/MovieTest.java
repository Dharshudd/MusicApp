package com.dharshini.musicapp;

import static org.junit.Assert.assertFalse;
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
		String inputLanguage = "Hi@di";
		isExist = MovieList.chooseLanguage(inputLanguage);
		assertFalse(isExist);
	}
	
	/**
	 * This method checks whether the input language is valid or not
	 */
	@Test
	public void testCase4() {
		String inputLanguage = "1amil";
		isExist = MovieList.chooseLanguage(inputLanguage);
		assertFalse(isExist);

	}

	/**
	 * This method checks whether the input language is valid or not
	 */
	@Test
	public void testCase5() {
		String inputLanguage = "English";
		isExist = MovieList.chooseLanguage(inputLanguage);
		assertFalse(isExist);
	}
	
	/**
	 * This method checks whether the input language is valid or not
	 */
	
	@Test
	public void testCase6() {
		String inputLanguage = " ";
		isExist = MovieList.chooseLanguage(inputLanguage);
		assertFalse(isExist);

	}
}
