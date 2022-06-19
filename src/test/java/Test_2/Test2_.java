package Test_2;

import Web.MyDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test2_ {
    /**
     * Ques-2:
     * Verify feelsLike-temp value is in between the low-temp value and high-temp value
     * Web: https://www.darksky.net/
     * points: 20
     */

    @Test
    public void verifyFeelLikeTempBtwLowHigh() {
        MyDriver.launchUrlOnNewWindow("https://darksky.net/");

        int feelsLiketemp = Integer.parseInt(MyDriver.getDriver().findElement(By.xpath("//span[@class='feels-like-text']")).getAttribute("innerHTML").replaceAll("\\D+", ""));
        int lowTemp = Integer.parseInt(MyDriver.getDriver().findElement(By.xpath("//span[@class='low-temp-text']")).getAttribute("innerHTML").replaceAll("\\D+", ""));
        int highTemp = Integer.parseInt(MyDriver.getDriver().findElement(By.xpath("//span[@class='high-temp-text']")).getAttribute("innerHTML").replaceAll("\\D+", ""));
        boolean result = false;
        if (feelsLiketemp >= lowTemp && feelsLiketemp <= highTemp) {
            result = true;
        }

        Assert.assertTrue(result, "Feel like trmp is not between low and high temp");
    }

    /**
     * Ques-1:
     * Create a method to return factorial value of input-int-value
     * points: 10
     * * eg:
     * * input -> 5
     * * returned value -> (5*4*3*2*1) = 120
     * *
     */

    public static int returnFactorialVal(int v) {
        int newVal = 1;
        for (int i = 1; i <= v; i++) {
            newVal *= i;

        }return newVal;
    }
        /**
         * Ques-3:
         * Create a method to return the common Strings values in two input-String-arrays
         * points: 30
         * Note: two input-String-arrays can be of same size or different size
         */
        /*
         *
         * eg:
         * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * returned value -> [happy, peace]
         *
         * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
         * returned value -> [abcde, koli]
         *
         */

        public static List<String> commonString (String[]array1, String[]array2){
            List<String> duplicateVal = new ArrayList<>();
            for (int i = 0; i < array1.length; i++)
                for (int j = 0; j < array2.length; j++)
                    if (array1[i].equalsIgnoreCase(array2[j])) {
                        duplicateVal.add(array1[i]);
                    }

        return duplicateVal;
        }
    /**
     * * Ques-4:
    * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
    * points: 40
    */
        /*
         *
         * eg:
         * 	input -> : {3, 5, 1, 4, 2, 7}
         * 	returned value : 6
         */
        public static int missingPosInt (int[] numbers) {
            //int[] nums = {3,1};
            int n=numbers.length;
            int sum=((n+1)*(n+2))/2;
            for(int i=0;i<n;i++)
                sum-=numbers[i];

            return sum;
        }

        }





