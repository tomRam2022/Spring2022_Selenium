package Helper;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class Misc {

    private static WebDriver driver;

        public static void pause(int seconds) {
            try {
                Thread.sleep(seconds*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void launchUrlOnNewWindow(String url) {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            driver = new ChromeDriver();

            driver.get(url);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void quitWindows() {
            driver.quit();
        }

        public static WebDriver getDriver() {
            return driver;
        }

        public static double fahToCelTemp ( int fTemp ){
            int temp = fTemp;
            int fahToCelTemp = (int) ((fTemp - 32.0D) * 5.0D / 9.0D);

            return fahToCelTemp;
    }




}
