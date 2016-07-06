package com.github.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.base.BaseClass;

public class GitHubStartPage extends BaseClass
{

	WebDriver driver;

	public GitHubStartPage(WebDriver driver)
	{
		System.out.println("e");
		this.driver=driver;
		PageFactory.initElements(driver, this);
		System.out.println(driver);
	}

	//signIn  Buttton
	@FindBy(xpath = "html/body/header/div/div/div/a[2]" )
	private WebElement signInBtn;

	public WebElement getsignInBtn()
	{
		return signInBtn;
	}

	//signUp Button
	@FindBy(css = ".btn.btn-primary.site-header-actions-btn" )
	private WebElement signUpBtn;
		
	public WebElement getsignUpBtn()
	{
		return signUpBtn;
	}
	
	public GitHubSignInPage clickSignin() 
	{
		System.out.println("g");
		signInBtn.click();
		System.out.println("h");
		return new GitHubSignInPage(this.driver);
	}
	
}
