package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitArticleEditorPage {
	@FindBy(name = "email") WebElement emailid;
	@FindBy(name = "password") WebElement password;
	@FindBy(xpath = "//button[text(),'Login']") WebElement loginButton;
	
	public ConduitArticleEditorPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
