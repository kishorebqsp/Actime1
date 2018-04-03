package Feb14;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_popup_toselect_todays_date {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Date d=new Date();
		String s = d.toString();
	System.out.println(s);
		Thread.sleep(1000);
		driver.findElement(By.id("DepartDate")).click();
	


	}

}
