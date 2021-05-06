package com.dharshini.musicapp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginTest {

	/**
	 * This method tests whether the login details are valid registered user details
	 */
	@Test	
	public void testCase1() {
		String inputMailId = "dharshu@gmail.com";
		String inputPassword = "123456";
		// To print in console
		boolean isValidUser = LoginLogic.loginDetailCheck(inputMailId, inputPassword);
		assertTrue(isValidUser);
	}
	
	/**
	 * This method tests whether the login details are valid registered user details
	 * 
	 */
	@Test
	public void testCase2() {
		String inputMailId = "kiru@gmail.com";
		String inputPassword = "123456";
		boolean isValidUser = LoginLogic.loginDetailCheck(inputMailId, inputPassword);
		assertTrue(isValidUser);
	}

	/**
	 * This method tests whether the login details are valid registered user details
	 * 
	 */
	@Test
	public void testCase3() {
		String inputMailId = "gokul@gmail.com";
		String inputPassword = "123456";
		boolean isValidUser = LoginLogic.loginDetailCheck(inputMailId, inputPassword);
		assertTrue(isValidUser);
	}
	
	/**
	 * This method tests whether the login details are valid registered user details
	 * tests for invalid input
	 */
	@Test
	public void testCase4() {
		String inputMailId = "new@gmail.com";
		String inputPassword = "123456";
		boolean isValidUser = LoginLogic.loginDetailCheck(inputMailId, inputPassword);
		assertFalse(isValidUser);
	}
	
	/**
	 * This method tests whether the login details are valid registered user details
	 * tests for invalid input
	 */
	@Test
	public void testCase5() {
		String inputMailId = "gokugmail.com";
		String inputPassword = "123456";
		boolean isValidUser = LoginLogic.loginDetailCheck(inputMailId, inputPassword);
		assertFalse(isValidUser);
	}
	
	/**
	 * This method tests whether the login details are valid registered user details
	 * tests for invalid input
	 */
	@Test
	public void testCase6() {
		String inputMailId = "dharshu@gmail.com";
		String inputPassword = "1234";
		boolean isValidUser = LoginLogic.loginDetailCheck(inputMailId, inputPassword);
		assertFalse(isValidUser);
	}

	/**
	 * This method tests whether the login details are valid registered user details
	 * tests for invalid input
	 */
	@Test
	public void testCase7() {
		String inputMailId = "";
		String inputPassword = "1234";
		boolean isValidUser = LoginLogic.loginDetailCheck(inputMailId, inputPassword);
		assertFalse(isValidUser);
	}
	
	/**
	 * This method tests whether the login details are valid registered user details
	 * tests for invalid input
	 */
	@Test
	public void testCase8() {
		String inputMailId = null;
		String inputPassword = "1234";
		boolean isValidUser = LoginLogic.loginDetailCheck(inputMailId, inputPassword);
		assertFalse(isValidUser);
	}

}
