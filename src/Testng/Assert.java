package Testng;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	public WebDriver driver;
	@Test(priority=-1)
	public void abc()
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		String t= driver.getTitle();
		Reporter.log(t);
		driver.findElement(By.xpath("//div[.='Login '  ]")).click();
		//org.testng.Assert.assertEquals(t,"actiTIME - Enter Time-Track1");
		driver.findElement(By.id("logoutLink")).click();
		driver.findElement(By.linkText("Actimind Inc.")).click();
		//driver.close();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(t,"actiTIME - Enter Time-Track1");
		//driver.findElement(By.linkText("Actimind Inc.")).click();
		sa.assertAll();
		//driver.close();
		
		
	}
	@Test(priority=1)
	public void xyz()
	{
		driver.navigate().refresh();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("mana1");
		driver.findElement(By.xpath("//div[.='Login '  ]")).click();
		//driver.findElement(By.xpath("//span[(.='Username or Password is invalid. Please try again.'"));
		driver.close();
	}

	@Test
	public void fat() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
		Point p=new Point(200,100);
		driver.manage().window().setPosition(p);
		driver.close();

	}

}
