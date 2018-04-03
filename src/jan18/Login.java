package jan18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	//driver.findElement(By.xpath())
	driver.manage().window().maximize();
	Thread.sleep(1000);
	Dimension d=new Dimension(100,200);
	driver.manage().window().setSize(d);
	Point p=new Point(200,100);
	driver.manage().window().setPosition(p);
	driver.close();

	}

}
