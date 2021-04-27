package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy (xpath  ="//span[contains(text(),'Log in')]")
	WebElement loginButton;
	
	@FindBy (xpath  ="//input[@name='session[username_or_email]']")
	WebElement emailtextbox;
	
	@FindBy (name  ="session[password]")
	WebElement passwordtextbox;
	
	
	@FindBy (xpath  ="//div[@class='css-18t94o4 css-1dbjc4n r-urgr8i r-42olwf r-sdzlij r-1phboty r-rs99b7 r-1w2pmg r-1fz3rvf r-usiww2 r-1pl7oy7 r-snto4y r-1ny4l3l r-1dye5f7 r-o7ynqc r-6416eg r-lrvibr']//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-rjixqe r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")
	WebElement loginbutton_2;
	
	public void openloginpage()
	{
		clickButton(loginButton);
	}
	
	public void login(String email, String password) 
	{
		sendtext(emailtextbox, email);
		sendtext(passwordtextbox, password);
		clickButton(loginbutton_2);
	}

}
