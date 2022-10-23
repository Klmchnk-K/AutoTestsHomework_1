package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage
{
    protected WebDriver driver;

    private By usernameLocator = By.xpath("//input[@id='field_email']");
    private By passwordLocator  = By.xpath("//input[@id='field_password']");
    private By loginButtonLocator  = By.xpath("//input[@value='Войти в Одноклассники']");
    private By userPageLocator  = By.xpath("//div[@class='tico ellip']");

    public SignInPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public HomePage loginUser(String username, String password)
    {
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
        driver.findElement(userPageLocator).click();

        return new HomePage(driver);
    }
}
