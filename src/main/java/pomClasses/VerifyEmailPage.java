package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyEmailPage {

	private WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Please enter the verification code sent at ']")
	private WebElement textmessage;
	public String textOnVerifyEmailPage()
	{
		return textmessage.getText();
	}
	
	
	public VerifyEmailPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
