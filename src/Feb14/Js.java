package Feb14;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Js {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.xpath("//a[.='Download']")).click();
		driver.findElement(By.xpath("//td[.='Java']/../td[4]/a")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_ENTER);
	}
}
	
