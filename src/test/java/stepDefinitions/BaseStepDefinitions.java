package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.DriverUtils;

public class BaseStepDefinitions extends BasePage {
    //WebDriver driver;

    public BaseStepDefinitions(DriverUtils d) {
        super(d.driver);
    }

    @Given("Launch the browser")
    public void launch_the_browser(){

        System.out.println("Browser is opened!");
    }
    @Given("Maximize the browser window")
    public void maximize_the_browser_window() {
        driver.manage().window().maximize();
    }
    @Given("Open automation practice")
    public void open_automation_practice() {
        driver.get("http://automationpractice.com/index.php");
    }
    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
