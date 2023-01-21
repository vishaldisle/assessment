package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {
	private WebDriver driver;

	@FindBy(xpath = "//h2[text()='Create Your Company Career Page']")
	private WebElement careerName;

	public String careerPageName() {
		return careerName.getText();
	}

	
	
	
	
	@FindBy(xpath = "//button[text()='Create your Career Page!']")
	private WebElement careerPage;

	public void careerPageButton() {
		careerPage.click();
	}
	
	public String urlofcompanyDetailpage()
	{
		return driver.getCurrentUrl();
	}
	
	public CareerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
