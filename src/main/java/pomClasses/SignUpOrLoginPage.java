package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpOrLoginPage {

	private WebDriver driver;
	
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;

	public void firstName(String fname) {
		firstName.sendKeys(fname);
	}

	public String valueFirstName() {
		return firstName.getAttribute("value").toString();
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;

	public void lastName(String lname) {
		lastName.sendKeys(lname);
	}

	public String valueLastName() {
		return lastName.getAttribute("value").toString();
	}
	
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	private WebElement phonenumber;
	public void phoneNumber(String number) {
		phonenumber.sendKeys(number);
	}

	public String valuePhoneNumber() {
		return phonenumber.getAttribute("value").toString();
	}
	
	@FindBy(xpath="//input[@placeholder='Work Email']")
	private WebElement email;
	public void workEmail(String ename) {
		email.sendKeys(ename);
	}

	public String valueWorkEmail() {
		return email.getAttribute("value").toString();
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordtextbox;
	
	public void passwordTextbox(String pass) {
		passwordtextbox.sendKeys(pass);
	}
	public String valuePassword() {
		return passwordtextbox.getAttribute("value").toString();
	}
	
	@FindBy(xpath="//button[text()='Sign Up For Free']")
	private WebElement signUpforFree;
	public void signUpForFreeButton()
	{
		signUpforFree.click();
	}
	public String getEmailVerifyPageURL()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	public SignUpOrLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
