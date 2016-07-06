package com.github.initialiser;

import org.openqa.selenium.WebDriver;

import com.github.pageobject.GitHubCreateRepositoryPage;
import com.github.pageobject.GitHubHomePage;
import com.github.pageobject.GitHubSignInPage;
import com.github.pageobject.GitHubStartPage;
//import com.github.terminalcommands.CommandLines;

public class Initialise
{
	 
		WebDriver driver;
		public GitHubStartPage strtPage;
		public GitHubSignInPage signInPage;
		public GitHubHomePage homePage;
		public GitHubCreateRepositoryPage createRepo;
		//public CommandLines cmdLine;
		public Initialise(WebDriver driver) 
		{
			this.driver = driver;
			strtPage = new GitHubStartPage(driver);
			signInPage = new GitHubSignInPage(driver);
			homePage = new GitHubHomePage(driver);
			createRepo = new GitHubCreateRepositoryPage(driver);
	//		cmdLine = new CommandLines();
		}
}
