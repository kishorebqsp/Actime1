import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pom {
	//Declartion
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwdtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	//Intailization
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public void Setusername()
	{
		untb.sendKeys("admin");
	}
	
	public void Setpassword()
	{
		pwdtb.sendKeys("manager");
	}
	
	public void login()
	{
		loginbtn.click();
	}
}
