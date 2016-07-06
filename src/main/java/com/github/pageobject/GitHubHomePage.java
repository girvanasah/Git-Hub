package com.github.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.base.BaseClass;

public class GitHubHomePage extends BaseClass
{

    WebDriver driver;
    
    public GitHubHomePage(WebDriver driver)
    {
       this.driver = driver;
       PageFactory.initElements(driver, this);
    }

	@FindBy(css = ".btn.btn-sm.btn-primary" )
	private WebElement newRepositoryBtn;
	public WebElement getNewRepoBtn()
	{
		return newRepositoryBtn;
	}
	
	@FindBy(linkText = "Pull requests")
	private WebElement pullRequests;
	public WebElement getPullRequests()
	{
		return pullRequests;
	}
	
	@FindBy(linkText = "Issues")
	private WebElement issues;
	public WebElement issues()
	{
		return issues;
	}
	
	@FindBy(linkText = "Gist")
	private WebElement gist;
	public WebElement gist()
	{
		return gist;
	}
	
   public GitHubCreateRepositoryPage clicknewRepo()
   {
	   enter(getNewRepoBtn());
	   return new GitHubCreateRepositoryPage(driver);
   }
}
