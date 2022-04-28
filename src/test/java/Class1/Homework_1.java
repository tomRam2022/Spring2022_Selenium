package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework_1 {

    @Test
    public void UseSelenium() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com/");

    }




}
