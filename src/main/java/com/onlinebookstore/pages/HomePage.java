package com.onlinebookstore.pages;

import com.onlinebookstore.customactions.CustomSeleniumActions;
import com.onlinebookstore.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.lang.reflect.Parameter;

public class HomePage extends TestBase {



    String pageName="Home Page";

    private By lbl_WelcomeHeader = By.xpath("//h1[text()='Welcome to Online ']");

    private By btn_Login = By.xpath("//a[text()='Login']");

    private By btn_Register = By.xpath("//a[text()='Register']");

    public By getWelcomeHeader() {
        return lbl_WelcomeHeader;
    }

    public By getLoginBtn() {
        return btn_Login;
    }

    public By getRegister() {
        return btn_Register;
    }

    public void confirmPageNavigation() {
        if (isElementExists(lbl_WelcomeHeader)) {
            testStep().pass(String.format("Page Successfully Navigated to %s", this.pageName));
        } else {
            testStep().fail(String.format("Not abel to Navigate to %s", this.pageName));
        }
    }

    public LoginPage clickOnLogin() {
        testStep().info(String.format("Click on Login Button on %s", this.pageName));
        click(btn_Login);
        return new LoginPage();
    }

    public RegisterPage navigateToRegistrationPage() {
        testStep().info(String.format("Click on Register Button on %s", this.pageName));
        click(btn_Register);
        return new RegisterPage();
    }


}
