package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	private WebDriver driver;

	public void URLmethod(String URL) {
		driver.get(URL);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,300)");
	}

	@FindBy(xpath = "//button[@class='ui button GetStartedHeader__StyleButton-sc-fm1kyw-21 iYMvVn']")
	private WebElement accesForFree;

	public void accesForFreeButton() throws InterruptedException {
		Thread.sleep(2000);
		accesForFree.click();
	}

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}















}
