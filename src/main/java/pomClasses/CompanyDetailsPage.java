package pomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyDetailsPage 
{
private WebDriver driver;

@FindBy(xpath="//input[@placeholder='Company Name']")
private WebElement TextBox;
public boolean companyNameTextBox()
{
	return TextBox.isDisplayed();
}

@FindBy(xpath="//input[@placeholder='Company Name']")
private WebElement ComapnyName;

public void comapnyNameEnter(String name)
{
	ComapnyName.sendKeys(name);
}

@FindAll({
	@FindBy(xpath="//div[@class='results transition']"),
	@FindBy(xpath="//div[@class='result']/div/div")
})
private List<WebElement>values;

public void nameOfCompany(String Nameofcompany) throws InterruptedException
{
	for(WebElement list:values)
	{
		if(list.getText().equals(Nameofcompany))
		{
			list.click();
			Thread.sleep(3000);
			break;
		}
	}
	
}

@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div/div/input")
private WebElement headQuarter;
public String headQuarterName() throws InterruptedException
{
	Thread.sleep(3000);
	return headQuarter.getAttribute("value").toString();
}

@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/div/div[3]/div[2]/div[2]/div/div/input")
private WebElement Website_Url;
public String website_UrlName() throws InterruptedException
{
	Thread.sleep(3000);
	return Website_Url.getAttribute("value").toString();
}




@FindBy(xpath="//div[@role='listbox']")
private WebElement dropdown;

public void dropdownBox()
{
	dropdown.click();
}


@FindAll({
	@FindBy(xpath="//div[@class='visible menu transition']"),
	@FindBy(xpath="//div[@role='option']")
})
private List<WebElement>list;

public void companySizedropdown(String sizeofcompany) throws InterruptedException
{
	for(WebElement lists:list)
	{
		if(lists.getText().equals(sizeofcompany))
		{
			lists.click();
			Thread.sleep(2000);
			break;
		}
	}
	
}

@FindBy(xpath="//div[@role='listbox']/div[1]")
private WebElement size;

public String actualSizegot()
{
	return size.getText();
}


@FindBy(xpath="//button[@class='ui icon right labeled button']")
private WebElement confirmButton;

public String  clickonConfirmButton()
{
	try {
	confirmButton.click();
	}
	catch (Exception e) {
	     JavascriptExecutor executor = (JavascriptExecutor) driver;
	     executor.executeScript("arguments[0].click();",confirmButton);
	}
	
	return driver.getCurrentUrl();
}



public CompanyDetailsPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

}
