package Programming_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/disabled.html");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript(, arg1)
		

	}

}
