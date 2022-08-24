package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver d){
        driver = d;
    }
}
