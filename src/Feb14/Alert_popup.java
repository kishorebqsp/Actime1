package Feb14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("loginbutton")).click();
		driver.
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();

	}

}
