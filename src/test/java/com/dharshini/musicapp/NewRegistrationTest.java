package com.dharshini.musicapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewRegistrationTest {
	boolean isExist;
	boolean isValid;
	
	/**
	 * This method checks whether the user is already a registered user if not a
	 * registered user, then registers the user. Else the test case fails
	 */
	@Test
	public void testCase() {
		String newUserEmail = "newUser1@gmail.com";
		String newUserPassword = "123456";
		isExist = NewRegistrationLogic.getNewUserDetails(newUserEmail, newUserPassword);
		assertTrue(isExist);
	}

	/**
	 * This method checks whether the user is already a registered user if not a
	 * registered user, then registers the user. Else the test case fails.
	 * Tests for invalid input
	 */
	@Test
	public void testCase1() {
		String newUserEmail = "dharshu@gmail.com";
		String newUserPassword = "123456";
		isExist = NewRegistrationLogic.getNewUserDetails(newUserEmail, newUserPassword);
		assertFalse(isExist);
	}

	/**
	 * This method validates whether the user input mail id is in correct format
	 * 
	 */
	@Test
	public void testCase2() {
		String newUserEmail = "kiru@gmail.com";
		String newUserPassword = "123456";
		isExist = NewRegistrationLogic.getNewUserDetails(newUserEmail, newUserPassword);
		assertFalse(isExist);
	}

	/**
	 * This method validates whether the user input mail id is in correct format
	 * Tests for invalid input
	 */
	@Test
	public void testCase3() {
		String newUserEmail = "dharshugmail.com";
		String newUserPassword = "123456";
		isExist = NewRegistrationLogic.getNewUserDetails(newUserEmail, newUserPassword);
		assertFalse(isExist);
	}
	
	/**
	 * This method validates whether the user input mail id is in correct format
	 * Tests for invalid input
	 */
	@Test
	public void testCase4() {
		String newUserEmail = "";
		String newUserPassword = "123456";
		isExist = NewRegistrationLogic.getNewUserDetails(newUserEmail, newUserPassword);
		assertFalse(isExist);
	}
}
