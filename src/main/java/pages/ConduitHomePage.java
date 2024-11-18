package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitHomePage {
	@FindBy(xpath = "//button[text(),'New Article']") WebElement newArticleButton;
	
	public ConduitHomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
