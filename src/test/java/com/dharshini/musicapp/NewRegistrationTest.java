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
	public void test() {
		String newUserEmail = "newUser1@gmail.com";
		String newUserPassword = "123456";
		isExist = NewRegistrationLogic.getNewUserDetails(newUserEmail, newUserPassword);
		assertTrue(isExist);
	}

	/**
	 * This method checks whether the user is already a registered user if not a
	 * registered user, then registers the user. Else the test case fails
	 */
	@Test
	public void test1() {
		String newUserEmail = "dharshu@gmail.com";
		String newUserPassword = "123456";
		isExist = NewRegistrationLogic.getNewUserDetails(newUserEmail, newUserPassword);
		assertTrue(isExist);
	}

	/**
	 * This method validates whether the user input mail id is in correct format
	 * 
	 */
	@Test
	public void mailValidationTest() {
		String newUserEmail = "dharshu@gmail.com";
		isValid = NewRegistrationLogic.verifyEmail(newUserEmail);
		assertTrue(isValid);
	}

	/**
	 * This method validates whether the user input mail id is in correct format
	 * 
	 */
	@Test
	public void mailValidationTest1() {
		String newUserEmail = "dharshugmail.com";
		isValid = NewRegistrationLogic.verifyEmail(newUserEmail);
		assertTrue(isValid);
	}
}
