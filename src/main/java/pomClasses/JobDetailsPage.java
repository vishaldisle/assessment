package pomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobDetailsPage 
{
private WebDriver driver;

@FindBy(xpath="//input[@placeholder='Job Title']")
private WebElement jobtitle;

public boolean jobTitalTextboxDisplay()
{
	return jobtitle.isDisplayed();
}
public void jobTitalTextbox(String jobtital) throws InterruptedException
{
	 jobtitle.sendKeys(jobtital);
	 Thread.sleep(3000);
}


@FindBy(xpath="//div[@role='listbox']")
private WebElement dropdowns;

public void experienceDropdownBoxclick()
{
	dropdowns.click();
}


@FindAll({
	@FindBy(xpath="//div[@class='visible menu transition']"),
	@FindBy(xpath="//div[@role='option']")
})
private List<WebElement>liste;

public void requiredExperienceDropdown(String experience) throws InterruptedException
{
	for(WebElement lists:liste)
	{
		if(lists.getText().equals(experience))
		{
			lists.click();
			Thread.sleep(3000);
			break;
		}
	}
	
}

@FindBy(xpath="//div[@role='listbox']/div/div[3]/span")
private WebElement selected;

public String actualSelectedExperience()
{
	return selected.getText();
}

@FindBy(xpath="//input[@placeholder='Job Location']")
private WebElement location;

public boolean jobLocationbox()
{
	return location.isDisplayed();
}

public void jobLocationtext(String loc)
{
	 location.sendKeys(loc);
}

@FindAll({
	@FindBy(xpath="//div[@class='ThemedTag__StyledTag-sc-371q41-1 iiNgzY theme-tag-']")
})
private List<WebElement>lists;
public void jobTypeSelection(String job) throws InterruptedException
{
	for(WebElement lis:lists)
	{
		if(lis.getText().equals(job))
		{
			lis.click();
			Thread.sleep(3000);
			break;
		}
	}
	
}

@FindBy(xpath="//div[text()='Part-Time']")
private WebElement job;

public String jobType()
{
	return job.getText();
}

@FindBy(xpath="//button[text()='Next']")
private WebElement next;
public void nextButton()
{
	next.click();
}
@FindBy(xpath="//div[text()='Add Additional Questions']")
private WebElement text;
public String addAdditionalQuestion()
{
	return text.getText();
}


public JobDetailsPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
