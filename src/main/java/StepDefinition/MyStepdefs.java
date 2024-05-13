package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    @Given("User provides username, password")
    public void userProvidesUsernamePassword() {
    System.out.println("User able to login");
    }

    @Then("User is able to login")
    public void userIsAbleToLogin() {
        WebDriver driver;
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Manoranjan PC\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.geeksforgeeks.org/");
        System.out.println("Login successfull");
    }

    @Then("Browser is closed")
    public void browserIsClosed() {
        //driver.close();
        System.out.println("Hi");
    }
}
