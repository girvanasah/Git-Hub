package com.github.pageobject;

import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.base.BaseClass;
import com.github.utility.Utility;

public class GitHubCreateRepositoryPage  extends BaseClass
{
	WebDriver driver;
	public String RepoName = Utility.getYamlValues("repository name");
	public GitHubCreateRepositoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "repository_name")
	private WebElement repoName;
	public WebElement entrRepoName()
	{
		return repoName;
	}
	
	@FindBy(id = "repository_auto_init")
	private WebElement autoReadme;
	public WebElement getAutoReadme()
	{
		return autoReadme;
	}
	
	@FindBy(id = "repository_description")
	private WebElement description;
	public WebElement description()
	{
		return description;
	}
	
	@FindBy(css = ".btn.btn-primary.first-in-line")
	private WebElement createRepoBtn;
	public WebElement getCreateRepoBtn()
	{
		return createRepoBtn;
	}
	
	public void Repo()
	{
		enterText(entrRepoName(), RepoName);
		enter(getCreateRepoBtn());
	}
		 

}
