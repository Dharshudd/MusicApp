package com.dharshini.musicapp;

public class NewRegistrationLogic {

	/**
	 * This method checks whether the user is already registered user or not
	 */

	public static boolean getNewUserDetails(String newUserEmail, String newUserPassword) {
		boolean isUser = false;
		if (verifyEmail(newUserEmail) == false) {
			System.out.println("Please Enter Valid EmailId");
			System.exit(0);
		} else {
			isUser = checkUser(newUserEmail, newUserPassword);

		}
		return isUser;
	}

	/**
	 * if the user is not registered user, then registers the user and adds the
	 * details to the array list. Else the condition fails
	 * 
	 * @param newUserEmail
	 * @param newUserPassword
	 * @return
	 */
	public static boolean checkUser(String newUserEmail, String newUserPassword) {
		boolean userCheck = false;
		if ((LoginLogic.registeredList.containsKey(newUserEmail))) {
			System.out.println("Already Registered. Go to Login Page");
			userCheck = false;
		} else {
			LoginLogic.registeredList.put(newUserEmail, newUserPassword);
			System.out.println("Succesfully Registered");
			System.out.println(LoginLogic.registeredList);
			userCheck = true;
		}
		return userCheck;
	}

	/**
	 * This method validates whether the user input mail id is in correct format or not
	 * @param newUserEmail
	 * @return
	 */
	public static boolean verifyEmail(String newUserEmail) {
		boolean isValidMail = true;
		if (newUserEmail == null || newUserEmail.equals("")) {
			isValidMail = false;
		}
		if (!newUserEmail.matches("[A-Za-z0-9+_.-]+@(.+)$")) {
			isValidMail = false;
		}
		return isValidMail;
	}
}