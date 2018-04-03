package Feb14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Framework_work extends Utilities{
	public WebDriver driver;
	@FindAll({
	@FindBy(xpath="//*[text()='username']) "),
			@FindBy(xpath="//*[text()='username']) ")
	})
    private WebElement un;
	
	@FindAll
	
	//public static final String uNAme="";
	
	@FindBy(id=uNAme)
	private WebElement un;
	
	@FindBy(id=password)
	private WebElement pw;
	
	public Framework_work(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void username()
	{
		un.sendKeys("hi");
	}

	public void password()
	{
		pw.sendKeys("bye");
	}
}
