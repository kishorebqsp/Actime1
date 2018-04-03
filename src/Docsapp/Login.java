package Docsapp;

import generic.Genericlibaries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;
	
//	public String name=Genericlibaries.getCellValue("", "", 1, 1);
	@FindBy(name=name)
	private WebElement eleUsernametextField;
	
	@FindBy(name="txtpassword")
	private WebElement elePasswordtextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement eleSigninButton;
	
	//@FindBy(xpath="//input[@value='+ Add']")
	//private WebElement eleAddButton;
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void eleUsernametextField()
	{
		eleUsernametextField.sendKeys("ops@docsapp.in");
	}
	public void elePasswordtextField()
	{
		elePasswordtextField.sendKeys("1@3$5^");
	}
	public void eleSigninButton()
	{
		eleSigninButton.click();
	}
	
}
