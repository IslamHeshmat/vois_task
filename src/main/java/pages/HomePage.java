package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//find elements 
	
	
	@FindBy (xpath ="//input[@placeholder='Search Twitter']")
	public WebElement assertloginmassage;
	
	@FindBy (xpath   ="//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
	 WebElement tweettextbox;
	
	@FindBy (xpath ="//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0')")
	 WebElement tweetbutton;
	
	@FindBy(xpath="//div[@aria-label='Add photos or video']//div[@class='css-901oao r-1awozwy r-13gxpu9 r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-rjixqe r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']//*[local-name()='svg']")
	 WebElement photobutton;
	
	@FindBy(xpath="//*[name()='path' and contains(@d,'M20.5 2.02')]")
	 WebElement GIFbutton;
	
	//create methods
	public void tweet(String tweet)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(tweettextbox));
		sendtext(tweettextbox, tweet);
		

		clickButton(tweetbutton);
	}
	public void phototweet(String photolocation)
	{
		clickButton(photobutton);
		sendtext(photobutton, photolocation);
	}
	
	public void GIFtweet(String weblink)
	{
		clickButton(GIFbutton);
		sendtext(GIFbutton, weblink);
	}
	
}
	
