package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_select {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html/Drop.html");
		WebElement d = driver.findElement(By.id("sobi corner"));
Select s=new Select(d);
s.selectByIndex(0);
s.selectByValue("p");
s.selectByVisibleText("panipuri");

List<WebElement> a = s.getAllSelectedOptions();
System.out.println(a);
WebElement f = s.getFirstSelectedOption();
System.out.println(f);

if(s.isMultiple()){
s.deselectByIndex(0);
s.deselectByValue("p");
s.deselectByVisibleText("panipuri");
s.deselectAll();
}
else
{
	System.out.println("bye");
}


driver.close();
}

}
