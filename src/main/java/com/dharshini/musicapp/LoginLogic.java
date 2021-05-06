package com.dharshini.musicapp;

import java.util.HashMap;

public class LoginLogic {

	/**
	 * This HashMap contains the details of registered users
	 */
	public static HashMap<String, String> registeredList = new HashMap<String, String>();
	static {
		registeredList.put("dharshu@gmail.com", "123456");
		registeredList.put("gokul@gmail.com", "123456");
		registeredList.put("kiru@gmail.com", "123456");
	}

	/**
	 * This method validates whether the user is registered user or not with the
	 * help of login details
	 * 
	 * @param inputMailId
	 * @param inputPassword
	 * @return
	 */
	public static boolean loginDetailCheck(String inputMailId, String inputPassword) {
		boolean isValid = false;
		if (isValidLogin(inputMailId, inputPassword)) {
			// for (String i : registeredList.keySet()) {
			if (registeredList.containsKey(inputMailId)) {
				String password = registeredList.get(inputMailId);
				if (password.equals(inputPassword)) {
					isValid = true;
				}
			}
		}
		displayLoginStatus(isValid);
		return isValid;
	}

	/**
	 * This method checks whether the user input mail id is valid or not by calling
	 * email validator method from NewRegistrationLogic class
	 * 
	 * @param inputMailId
	 * @param inputPassword
	 * @return
	 */

	public static boolean isValidLogin(String inputMailId, String inputPassword) {
		boolean isExist = false;
		// email validation is done
		if (NewRegistrationLogic.verifyEmail(inputMailId)) {
			isExist = true;
		} else {
			isExist = false;
			System.out.println("Please Enter Valid MailId");
		}
		return isExist;
	}

	/**
	 * This method prints login status in console
	 * 
	 * @param isExist
	 */
	public static void displayLoginStatus(boolean isValid) {
		if (isValid == true) {
			System.out.println("Successfully LoggedIn");
		} else {
			System.out.println("Invalid Login credentials");
		}
	}
}
