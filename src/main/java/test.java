import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String args[])
    {
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
