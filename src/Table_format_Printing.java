import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Table_format_Printing {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			//printing content of table (but not in the table format)
		//	WebDriver driver=new FirefoxDriver();
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//	driver.get("file:///C:/Users/Admin/Desktop/Table.html");
			//List<WebElement> alltd = driver.findElements(By.tagName("td"));
		//	for(WebElement td:alltd)
			//{
		//		System.out.println(td.getText());
		//	}
			//printing in table format
			//WebDriver driver=new FirefoxDriver();
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//driver.get("file:///C:/Users/Admin/Desktop/programing%20class/Table.html");
			//List<WebElement> alltr = driver.findElements(By.tagName("tr"));
			//for(int i=0;i<alltr.size();i++)
			//{
				//WebElement tr = alltr.get(i);
				// List<WebElement> alltd = tr.findElements(By.tagName("td"));
				// for(int j=0;j<alltd.size();j++)
				// {
				//	String t = alltd.get(j).getText();
					//System.out.println(t+" ");
				// }
				// System.out.println();
			//}
		//driver.close();	
//}
	
	//using enchance for loop
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/Admin/Desktop/programing%20class/Table.html");
	List<WebElement> alltr = driver.findElements(By.tagName("tr"));
	for(WebElement a:alltr)
	System.out.println(a);
	for(int i=0;i<alltr.size();i++)
	{
		WebElement tr = alltr.get(i);
		 List<WebElement> alltd = tr.findElements(By.tagName("td"));
		 for(int j=0;j<alltd.size();j++)
		 {
			String t = alltd.get(j).getText();
			System.out.println(t+" ");
		 }
		 System.out.println();
	}
driver.close();	
}
}
