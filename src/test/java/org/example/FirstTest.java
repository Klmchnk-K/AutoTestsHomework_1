package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FirstTest
{
    private String chromeDriver = "webdriver.chrome.driver";
    private String chromeDriverPath = "D:\\Install\\Chromedriver\\chromedriver.exe";
    private String okURL = "https://ok.ru";
    private String testUsername = "technoPol15";
    private String testPassword = "technoPolis2022";
    private String testFullName = "technoPol15 technoPol15";

    @Test
    public void myFirstTest()
    {
        System.setProperty(chromeDriver, chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(okURL);

        SignInPage signInPage = new SignInPage(driver);

        HomePage homePage = signInPage.loginUser(testUsername, testPassword);

        assert(homePage.getFullNameText().equals(testFullName));
    }
}
