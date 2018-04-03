import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']"));
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("actiTIME - Login"))
		{
			System.out.println("homepage is diaplayed");
		}
		
		else
		{
			System.out.println("homepage is not diaplayed");
		}
		

	}

}
