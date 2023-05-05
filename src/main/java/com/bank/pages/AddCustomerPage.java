package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    // Storing all the locators
    // Storing Add customer locator
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    // Storing Enter first name locator
    By firstName = By.xpath("//input[@placeholder='First Name']");
    // Storing Last name locator
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    // Storing Postcode locator
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    // Storing Add customer button locator
    By clickAddCustomer = By.xpath("//button[@type='submit']");

    // Defining all the methods
    public void clickingOnAddCustomerButton() { // Method to click on Add customer button
        clickOnTheElement(addCustomer);
    }

    public void enteringFirstNameInToFirstNameField(String fName) { // Method to Send First name
        sendTextToElement(firstName, fName);
    }

    public void enteringLastNameInToLastNameField(String lName) { // Method to send last name
        sendTextToElement(lastName, lName);
    }

    public void enteringPostCodeInToPostCodeField(String pCode) { // Method to send post code
        sendTextToElement(postCode, pCode);
    }

    public void clickingOnAddCustomer() { // Method to click on Add customer after entering necessary data
        clickOnTheElement(clickAddCustomer);
    }
}
