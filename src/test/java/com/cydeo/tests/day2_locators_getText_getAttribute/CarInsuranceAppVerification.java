package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceAppVerification {
    public static void main(String[] args) {


//    1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//2. Go to
//    https://www.qa1.excelsoirinsurance.com/login

        driver.get("https://www.qa1.excelsoirinsurance.com/login ");


//            3. Verify URL contains Expected: "excelsoirinsurance"

        String expectedURL = "excelsoirinsurance"; // comes from requirement // no need to assign Strings like this we can do if statements right away. no need to store it if we will need it only once. if need more times than put in String better
        String actualURL = driver.getCurrentUrl(); // comes from browser

        if(actualURL.contains(expectedURL)){
            System.out.println("URL Verification is PASSED");
        }else{
            System.out.println("URL Verification is FAILED");
        }


//            4. Verify title:  Expected: "Login | Excelsoir Insurance"

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login | Excelsoir Insurance";

        if(actualURL.equals(expectedTitle)){
            System.out.println("Title Verification passed");
        }else{
            System.out.println("Title Verification failed");
        }


        driver.quit();





    }
}
