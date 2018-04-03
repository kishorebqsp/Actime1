package seleniumbtr1;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementandFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Desktop/programing%20class/webpage22.html");
		//Example for driver.findelements
		List<WebElement> a1 = driver.findElements(By.tagName("span"));
		System.out.println(a1.size());
		for(WebElement b:a1)
		{
			System.out.println(b.getText());
		}
		
		WebElement element = driver.findElement(By.id("d2"));
		//example for element.findelements
		List<WebElement> a2 = element.findElements(By.tagName("span"));
		System.out.println(a2.size());
		for(WebElement b1:a2)
		{
			System.out.println(b1.getText());
		}
		
	
	}
}
