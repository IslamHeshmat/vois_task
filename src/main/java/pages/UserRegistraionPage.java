package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistraionPage extends PageBase{

	public UserRegistraionPage(WebDriver driver) {
		super(driver);
		
	
	}
	//find elements 
	@FindBy (id="gender-male")
	WebElement genderRadioButton;
	
	@FindBy (id="FirstName")
	WebElement Firetnametextbox;
	
	@FindBy (id="LastName")
	WebElement lastnametextbox;
	
	@FindBy (id="Email")
	WebElement Emailtextbox;
	
	@FindBy (id="Password")
	WebElement Passwordtextbox;
	
	@FindBy (id="ConfirmPassword")
	WebElement ConfirmPasswordtextbox;
	
	@FindBy (id="register-button")
	WebElement RegisterButton;
	
	@FindBy (xpath ="//div[contains(text(),'Your registration completed')]" )
	public WebElement AssertRegisterButton;
	
	//create method 
	public void UserRegistraion(String firstname,String lastname, String email, String password)
	{
		clickButton(genderRadioButton);
		sendtext(Firetnametextbox, firstname);
		sendtext(lastnametextbox, lastname);
		sendtext(Emailtextbox, email);
		sendtext(Passwordtextbox, password);
		sendtext(ConfirmPasswordtextbox, password);
		clickButton(RegisterButton);
		
		//genderRadioButton.click();
		//Firetnametextbox.sendKeys(firstname);
		//lastnametextbox.sendKeys(lastname);
		//Emailtextbox.sendKeys(email);
		//Passwordtextbox.sendKeys(password);
		//ConfirmPasswordtextbox.sendKeys(password);
		//RegisterButton.click();
	}

}
