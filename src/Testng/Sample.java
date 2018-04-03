package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
public	WebDriver driver;
	@BeforeMethod
	public void openapplication()
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	}