package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostAJobPage {

	private WebDriver driver;
	
	
	
	@FindBy(xpath="//button[text()='Post a Job!']")
	private WebElement postJob;
	public void postJobButton() {
		postJob.click();
	}
	
	public String urlofcompanyDetailpage()
	{
		return driver.getCurrentUrl();
	}
	
	
	

	public PostAJobPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
