package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    // Storing all the locators
    // Storing Open account button locator
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");
    // Storing the customer selection locator
    By customerNameSelect = By.cssSelector("#userSelect");
    //By.xpath("//select[@id='userSelect']");
    // Storing the Currency locator
    By currencyDropDown = By.xpath("//select[@id='currency']");
    // Storing the Process button locator
    By processButton = By.xpath("//button[@type='submit']");

    // Defining all the methods
    public void clickingOnTheOpenAccountButton() { // Method to click on open account button
        clickOnTheElement(openAccount);
    }

    // Method to Select the customer name from customer-name drop down menu
    public void selectingCreatedCustomerFromTheCustomerNameDropDown(String cName) {
        clickOnTheElement(customerNameSelect);
        selectByVisibleTextFromDropDown(customerNameSelect, cName);
    }

    // Method to select the currency from currency drop down menu
    public void selectingTheCurrencyFromCurrencyDropDown(String currency) {
        clickOnTheElement(currencyDropDown);
        selectByVisibleTextFromDropDown(currencyDropDown, currency);
    }

    public void clickingOnTheProcessButton() { // Method to click on process button
        clickOnTheElement(processButton);
    }
}
