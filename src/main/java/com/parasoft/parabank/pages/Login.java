package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class Login extends Utility {
    By usernameLink = By.xpath("//input[@name='username']");
    By passwordLink = By.xpath("//input[@name='password']");
    By loginLink = By.xpath("//input[@value='Log In']");
    By vlogin = By.xpath("//h1[text()='Accounts Overview']");
    By verrorMsg=By.xpath("//p[contains(text(),'The username and password could not be verified.')]");
    By logoutLink=By.xpath("//a[text()='Log Out']");
    By vloginlink=By.xpath("//h2[text()='Customer Login']");

    public void username(String Username) {
        sendTextToElement(usernameLink, Username);
    }

    public void Password(String password) {
        sendTextToElement(passwordLink, password);
    }

    public void clickOnLogin() {
        clickOnElement(loginLink);
    }

    public String verifylogin() {
        return getTextFromElement(vlogin);
    }
    public String verifyerrorMsg() {
        return getTextFromElement(verrorMsg);
    }
    public void clickOnLogout() {
        clickOnElement(logoutLink);
    }
    public String verifyloginafterlogout() {
        return getTextFromElement(vloginlink);
    }
}
