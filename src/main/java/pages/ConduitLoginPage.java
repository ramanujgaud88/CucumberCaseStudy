package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitLoginPage {
	@FindBy(name = "email") WebElement emailid;
	@FindBy(name = "password") WebElement password;
	@FindBy(xpath = "//button[text(),'Login']") WebElement loginButton;
	
	public ConduitLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void couditLogin(String emailId, String passWord){
		emailid.sendKeys(emailId);
		password.sendKeys(passWord);
		loginButton.click();
	}
}
