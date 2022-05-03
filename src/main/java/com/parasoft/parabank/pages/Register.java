package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class Register extends Utility {
    By Register = By.xpath("//a[text()='Register']");
    By vRegister = By.xpath("//h1[text()='Signing up is easy!']");
    By Firstname = By.xpath("//input[@name='customer.firstName']");
    By Lastname = By.xpath("//input[@name='customer.lastName']");
    By Address = By.xpath("//input[@name='customer.address.street']");
    By City = By.xpath("//input[@name='customer.address.city']");
    By State = By.xpath("//input[@name='customer.address.state']");
    By ZipCode = By.xpath("//input[@id='customer.address.zipCode']");
    By phoneNumber = By.xpath("//input[@name='customer.phoneNumber']");
    By SSN = By.xpath("//input[@name='customer.ssn']");
    By username = By.xpath("//input[@name='customer.username']");
    By Password = By.xpath("//input[@name='customer.password']");
    By Confirm = By.xpath("//input[@name='repeatedPassword']");
    By REGISTER = By.xpath("//input[@value='Register']");
    By verifictionMessge = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public void clickOnRegistertion() {
        clickOnElement(Register);
    }

    public String verifyregister() {
        return getTextFromElement(vRegister);
    }

    public void entertFirstname(String firstname) {
        sendTextToElement(Firstname, firstname);
    }

    public void enterLastname(String lastname) {
        sendTextToElement(Lastname, lastname);
    }

    public void enterAddress(String address) {
        sendTextToElement(Address, address);
    }

    public void enterCity(String city) {
        sendTextToElement(City, city);
    }

    public void enterState(String state) {
        sendTextToElement(State, state);
    }

    public void enterZipCode(String zipCode) {
        sendTextToElement(ZipCode, zipCode);
    }

    public void enterphoneNumber(String PhoneNumber) {
        sendTextToElement(phoneNumber, PhoneNumber);
    }

    public void enterSSN(String sSN) {
        sendTextToElement(SSN, sSN);
    }

    public void enterusername(String Username) {
        sendTextToElement(username, Username);
    }

    public void enterPassword(String password) {
        sendTextToElement(Password, password);
    }

    public void enterConfirm(String confirm) {
        sendTextToElement(Confirm, confirm);
    }

    public void Registertionbutton() {
        clickOnElement(REGISTER);
    }

    public String vregister() {
        return getTextFromElement(verifictionMessge);
    }
}
