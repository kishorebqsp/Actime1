import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Pom1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Pom p=new Pom(driver);
		p.Setusername();
		p.Setpassword();
		p.login();

	}

}
