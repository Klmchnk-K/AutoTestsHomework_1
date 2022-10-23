package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    protected WebDriver driver;

    private By fullNameLocator = By.tagName("h1");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getFullNameText()
    {
        return driver.findElement(fullNameLocator).getText();
    }
}
