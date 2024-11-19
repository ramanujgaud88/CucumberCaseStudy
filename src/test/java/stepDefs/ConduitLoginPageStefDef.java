package stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.ConduitLoginPage;

public class ConduitLoginPageStefDef  {
	WebDriver driver;
	ConduitLoginPage clp = new ConduitLoginPage(driver);
  @Test
  
  @Given("User is on login page")
  public void user_is_on_login_page() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
      driver.get("https://conduit-realworld-example-app.fly.dev/#/login");
  }
  @When("User Enters {emailId} and {password}")
  public void user_enters_and(String emailId, String password) {	  
	  clp.couditLogin(emailId, password);
  }
  @Then("Conduit homepage should open")
  public void conduit_homepage_should_open() {
	  
  }
}
