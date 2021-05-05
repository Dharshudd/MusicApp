package com.dharshini.musicapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginTest {
	boolean isValidUser;

	/**
	 * This method tests whether the login details are valid registered user details
	 */
	@Test
	public void testCase1() {
		String inputMailId = "dharshu@gmail.com";
		String inputPassword = "123456";
		// To print in console
		LoginLogic.displayLoginStatus(LoginLogic.isValidLogin(inputMailId, inputPassword));
		isValidUser = LoginLogic.isValidLogin(inputMailId, inputPassword);
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
		LoginLogic.displayLoginStatus(LoginLogic.isValidLogin(inputMailId, inputPassword));
		isValidUser = LoginLogic.isValidLogin(inputMailId, inputPassword);
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
		LoginLogic.displayLoginStatus(LoginLogic.isValidLogin(inputMailId, inputPassword));
		isValidUser = LoginLogic.isValidLogin(inputMailId, inputPassword);
		assertTrue(isValidUser);
	}
	
	/**
	 * This method tests whether the login details are valid registered user details
	 * 
	 */
	@Test
	public void testCase4() {
		String inputMailId = "new@gmail.com";
		String inputPassword = "123456";
		LoginLogic.displayLoginStatus(LoginLogic.isValidLogin(inputMailId, inputPassword));
		isValidUser = LoginLogic.isValidLogin(inputMailId, inputPassword);
		assertTrue(isValidUser);
	}

}
