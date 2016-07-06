package com.github.test;

import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.initialiser.Initialise;

public class TestGit
{
	  WebDriver driver;
	  Initialise init;
	  
	  @Test(priority=0)
	  public void strtTest()
	  {
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  Assert.assertEquals(driver.getTitle() , "How people build software · GitHub");
	  }
	  
	  @Test(dependsOnMethods = {"strtTest"})
	  public void signInTest()
	  {
		  init.strtPage.clickSignin();
		  Assert.assertEquals(driver.getTitle() , "Sign in to GitHub · GitHub");
	  }
	  
	  @Test(dependsOnMethods = {"signInTest"})
	  public void homeTest()
	  {
		  
		  init.signInPage.login();
		  Assert.assertEquals(driver.getTitle() , "GitHub");
	  }
	  
	  @Test(dependsOnMethods = {"homeTest"})
	  public void createRepoTest()
	  {
		  init.homePage.clicknewRepo();
		  Assert.assertEquals(driver.getTitle() , "Create a New Repository");
	  }
	  
	  @Test(dependsOnMethods = {"createRepoTest"})
	  public void repoNameTest()
	  {
		  init.createRepo.Repo();
		  Assert.assertEquals(driver.getTitle() , init.signInPage.usrname +"/" +init.createRepo.RepoName);
	  }
	  
	  //@Test(dependsOnMethods = {"repoNameTest"})
	  //public void codePush() throws IOException
	  //{
		//  init.cmdLine.runCommand();
		//  Assert.assertEquals("" , "");
		  
	  //}
	  
	  
	  
	  @BeforeClass
	  public void beforeClass() 
	  {
		  this.driver = new FirefoxDriver();
		  //this.driver = driver;
		  driver.get("https://www.github.com");
		  init = new Initialise(this.driver);
	  }
}
