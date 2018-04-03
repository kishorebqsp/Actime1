package Feb14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Work {
	
	public WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Admin/Desktop/framework.html");
	
	Framework_work fw=new Framework_work(driver);
	fw.username();
	fw.password();
	driver.close();
	
	}
}
