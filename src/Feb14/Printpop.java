package Feb14;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Printpop {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Runtime.getRuntime().exec("D:/print.exe");

	}

}
