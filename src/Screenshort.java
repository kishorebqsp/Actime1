import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshort {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest=new File("D://pictureacti.png");
		FileUtils.copyFile(src,dest);

	}

}
