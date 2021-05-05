package com.dharshini.musicapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class DGMusiczAppManager {

	boolean isValidUser;
	
	
	
	@Test
				//login
	public void loginTest() {
			String inputMailId = "dharshu@gmail.com";
			String inputPassword = "123456";
			//To print in console
			LoginLogic.displayLoginStatus(LoginLogic.isValidLogin(inputMailId, inputPassword));
			isValidUser = LoginLogic.isValidLogin(inputMailId,inputPassword);
			assertTrue(isValidUser);
		}
	
	@Test
				//language
	public void languageTest() {
		System.out.println("Displaying Available Languages");
		System.out.println("------------------------------");
		LanguageList.displayAvailableLanguage();
	}
	
	@Test
				//movie
	public void movieTest(){
		boolean isExist;
		String inputLanguage = "tamil";
		isExist = MovieList.chooseLanguage(inputLanguage);
		assertTrue(isExist);

	}
	

	@Test
				//songs
	public void songTest(){
		String inputMovie = "Dil BechaRa";
		SongsList.chooseMovie(inputMovie);
	}

}
