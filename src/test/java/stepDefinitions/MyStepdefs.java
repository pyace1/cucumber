package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;

    @Given("Launch the browser")
    public void launch_the_browser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Given("Maximize the browser window")
    public void maximize_the_browser_window() {
        driver.manage().window().maximize();
    }
    @Given("Open automation practice")
    public void open_automation_practice() {
        driver.get("http://automationpractice.com/index.php");
    }
    @Given("Navigate to Sign in page")
    public void navigate_to_sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {string} in email field")
    public void user_enters_in_email_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {string} in password field")
    public void user_enters_in_password_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Error message is displayed")
    public void error_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
