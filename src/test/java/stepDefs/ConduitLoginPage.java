package stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class ConduitLoginPage {
	WebDriver driver;
  @Test
  
  @Given("User is on login page")
  public void user_is_on_login_page() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
      driver.get("https://conduit-realworld-example-app.fly.dev/#/login");
  }
  @When("User Enters {username} and {password}")
  public void user_enters_and(String username, String password) {

  }
  @Then("Conduit homepage should open")
  public void conduit_homepage_should_open() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
  @Given("User is on article editor page")
  public void user_is_on_article_editor_page() {
      
      
  }
  @When("User add the article Details")
  public void user_add_the_article_details(io.cucumber.datatable.DataTable dataTable) {
      // Write code here that turns the phrase above into concrete actions
      // For automatic transformation, change DataTable to one of
      // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
      // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
      // Double, Byte, Short, Long, BigInteger or BigDecimal.
      //
      // For other transformations you can register a DataTableType.
      throw new io.cucumber.java.PendingException();
  }
  @When("publish article")
  public void publish_article() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
  @Then("Article should get created with the article Title")
  public void article_should_get_created_with_the_article_title() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
}
