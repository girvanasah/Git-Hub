package com.github.pageobject;

import org.openqa.selenium.WebDriver;
import com.github.utility.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.github.base.BaseClass;

public class GitHubSignInPage extends BaseClass
{
	WebDriver driver;
	public String usrname =  Utility.getYamlValues("username");
	
	public GitHubSignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(css = "#login_field")
    private WebElement username;
    
    public WebElement getusername()
	{
		return username;
	}
	
    @FindBy(css = "#password")
    private WebElement password;
	
    public WebElement getpassword()
	{
		return password;
	}
    
    @FindBy(css = ".btn.btn-primary.btn-block")
    private WebElement logInBtn;
    
   
    public WebElement getlogInBtn()
	{
		return logInBtn;
	}
    
    @FindBy(css = ".label-link")
    private WebElement forgotPass;
    
    public WebElement getforgotPass()
	{
		return forgotPass;
	}
    
    @FindBy(css = ".create-account-callout.mt-3>a")
    private WebElement createAccount;
    
    public WebElement getcreateAccount()
	{
		return createAccount;
	}
    
    public GitHubHomePage login()
	{
    	String password =  Utility.getYamlValues("password");
    	enterText(this.username, usrname);
    	enterText(this.password, "qwertyuiop1");
    	enter(this.logInBtn);
    	return new GitHubHomePage(driver);
	}
}
