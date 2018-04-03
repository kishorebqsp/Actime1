package Feb14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("input_resumeParser")).sendKeys("‪C:\\2.1 XML.docx");

	}

}
