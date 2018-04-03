package Cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
String s = driver.getCurrentUrl();
System.out.println(s);
String t = driver.getTitle();
System.out.println(t);
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

}
