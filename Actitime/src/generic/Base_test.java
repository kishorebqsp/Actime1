package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  class Base_test implements Auto_const{
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void Closeappln()
	{
		driver.quit();
	}
	
	
	

}
