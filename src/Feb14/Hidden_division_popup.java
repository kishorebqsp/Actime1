package Feb14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("DepartDate")).click();
		Alert a = driver.switchTo().alert();
		//driver.findElement(By.id("DepartDate")).click();
		a.accept();
		driver.findElement(By.xpath("(//a[.='14'])[1]")).click();

	}

}
