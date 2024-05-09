import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class def_login {
    @Given("User provides username, password")
    public void userProvidesUsernamePassword() {
        System.out.println("User provided the username, pwd-Given");
    }

    @When("user enters")
    public void userEnters() {
        System.out.println("When is executed");
    }

    @And("click on login")
    public void clickOnLogin() {
        System.out.println("And is excuted");
    }

    @Then("User is able to login")
    public void userIsAbleToLogin() {
        System.out.println("Then is excuted");
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Manoranjan PC\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.geeksforgeeks.org/");
    }
}
