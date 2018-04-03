package Feb14;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hub {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		URL node =new URL("http://192.168.56.1:4444/wd/hub");
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName("chrome");
		
		WebDriver driver1=new RemoteWebDriver(node, browser);
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver2.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=VMWLWoWlHoavX9OFgcAK&gws_rd=ssl");
			Thread.sleep(3000);
			driver2.findElement(By.id("lst-ib")).sendKeys("java");
		driver2.quit();
		
		}

}
