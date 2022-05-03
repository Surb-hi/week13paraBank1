package com.parasoft.parabank.Testsuits;

import com.parasoft.parabank.pages.Login;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    Login login = new Login();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        login.username("sur");
        login.Password("prime123");
        login.clickOnLogin();
        String expectedMsg = "Accounts Overview";
        String actualMsg = login.verifylogin();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }

    @Test
    public void verifyTheErrorMessage() {
        login.username("surbhi");
        login.Password("qwe123");
        login.clickOnLogin();
        String expectedMsg = "The username and password could not be verified.";
        String actualMsg = login.verifyerrorMsg();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }

    @Test
    public void userShouldLogOutSuccessfully() {
        login.username("sur");
        login.Password("prime123");
        login.clickOnLogin();
        login.clickOnLogout();
        String expectedMsg = "Customer Login";
        String actualMsg = login.verifyloginafterlogout();
        Assert.assertEquals(actualMsg, expectedMsg, "");

    }
}
