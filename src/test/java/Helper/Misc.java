package Helper;

import Web.MyDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class Misc {
    //static WebDriver driver;

    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //  public static void launchUrlOnNewWindow(String url) {
    //System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    //    driver = new ChromeDriver();

    //    driver.get(url);

    //    try {
    //        Thread.sleep(5000);
    //    } catch (InterruptedException e) {
    //        e.printStackTrace();
    //}
    //}

    //public static void quitWindows() {
    //    MyDriver.quit();
    //}

    //public static WebDriver getDriver() {
    //    return driver;
    //}

    public static double fahToCelTemp(int fTemp) {
        int temp = fTemp;
        int fahToCelTemp = (int) ((fTemp - 32.0D) * 5.0D / 9.0D);

        return fahToCelTemp;

    }

    public static void JavaScriptExecute(String action) {
        JavascriptExecutor jS = (JavascriptExecutor) MyDriver.getDriver();

        jS.executeScript(action);
    }

    public static String CurrentFormattedDateStlye(String dateStyle) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat(dateStyle);

        String formattedDate = sdf.format(now);

        return formattedDate;
    }

    public static Boolean switchToRightWin(String windowTitle, Set<String> hList) {
        for (String e : hList) {
            String title = MyDriver.getDriver().switchTo().window(e).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("found the right window");
                return true;

            }
        }
        return false;
    }

    public static void closeAllExept(String windowTitle, Set<String> hList) {
        for (String leaveOpen : hList) {
            if (!leaveOpen.contains(windowTitle)) {
                MyDriver.getDriver().switchTo().window(leaveOpen).close();

            }
        }
    }

    public static void switchWin(String window) {
        MyDriver.getDriver().switchTo().window(window);
    }

    public static String getWinHandle(String winTitle, Set<String> hList) {
        String win = "";
        for (String e : hList) {
            String title = MyDriver.getDriver().switchTo().window(e).getTitle();
            if (title.contains(winTitle)) {
                win = MyDriver.getDriver().switchTo().window(e).getWindowHandle();
            }
        }
        return win;
    }
}
