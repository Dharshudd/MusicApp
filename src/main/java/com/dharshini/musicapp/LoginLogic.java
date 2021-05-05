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
	 * @return isExist
	 */
	public static boolean isValidLogin(String inputMailId, String inputPassword) {
		boolean isExist = false;
		if ((registeredList.containsKey(inputMailId))) {
			isExist = true;
		}
		return isExist;
	}

	/**
	 * This method prints login status in console
	 * 
	 * @param isExist
	 */
	public static void displayLoginStatus(boolean isExist) {
		// TODO Auto-generated method stub
		if (isExist == true) {
			System.out.println("Successfully LoggedIn");
		} else {
			System.out.println("Invalid Login credentials");
		}
	}
}
