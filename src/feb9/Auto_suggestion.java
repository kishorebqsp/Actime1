package feb9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_suggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver	driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=VMWLWoWlHoavX9OFgcAK&gws_rd=ssl");
			driver.findElement(By.id("lst-ib")).sendKeys("java");
			List<WebElement> s = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
int count=s.size();
System.out.println(count);
s.get(1).click();
	}

}
