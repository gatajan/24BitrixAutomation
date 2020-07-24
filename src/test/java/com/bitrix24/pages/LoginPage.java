package com.bitrix24.pages;

import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    @FindBy(name="USER_LOGIN")
    private WebElement login;

    @FindBy (name = "USER_PASSWORD")
    private WebElement password;

    @FindBy (className = "login-btn")
    private WebElement loginButton;

    public void enterUsername(){
    login.sendKeys(ConfigurationReader.getProperty("username"));
    }

    public void enterPassword(){
       password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    public void clickLogin(){
        loginButton.click();
    }

    public void login(){
        enterUsername();
        enterPassword();
        clickLogin();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    }

