package com.parasoft.parabank.Testsuits;

import com.parasoft.parabank.pages.Register;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    Register register=new Register();
    @Test
    public void verifyThatSigningUpPageDisplay() {
        register.clickOnRegistertion();
        String expectedMsg = "Signing up is easy!";
        String actualMsg = register.verifyregister();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }
    @Test
    public void userSholdRegisterAccountSuccessfully()
    {   register.clickOnRegistertion();
        register.entertFirstname("surbhi");
        register.enterLastname("patel");
        register.enterAddress("6 lee street");
        register.enterCity("london");
        register.enterState("east middland");
        register.enterZipCode("380000");
        register.enterphoneNumber("7898765430");
        register.enterSSN("78975997");
        register.enterusername("sur");
        register.enterPassword("prime123");
        register.enterConfirm("prime123");
        register.Registertionbutton();
        String expectedMsg="Your account was created successfully. You are now logged in.";
        String actualMsg=register.vregister();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }
    }

