package Feb14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import java.time.LocalDateTime;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Confirmation_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        Thread.sleep(1000);
	driver.findElement(By.xpath("//div[.='Users']")).click();
	 Thread.sleep(1000);
	driver.findElement(By.id("ext-gen7")).click();
	 Thread.sleep(1000);
	driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("bharu");
	 Thread.sleep(1000);
	driver.findElement(By.id("userDataLightBox_cancelBtn")).click();
	 Thread.sleep(1000);
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
	a.dismiss();
		driver.close();
		

		
	}

}
