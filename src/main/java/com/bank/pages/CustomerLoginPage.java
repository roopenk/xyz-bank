package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    // Storing all the locators
    // Storing Customer login button locator
    By customerLoginButton = By.xpath("//button[normalize-space()='Customer Login']");
    // Storing Your name locator
    By selectYourName = By.xpath("//select[@id='userSelect']");
    // Storing Login button locator
    By loginButton = By.xpath("//button[@type='submit']");
    // Storing the Logout Tab locator
    By logoutTab = By.xpath("//button[@class='btn logout']");
    // Storing login locator used after selecting the required customer from the customer login page
    By customerLogin = By.xpath("//button[@type='submit']");

    // Defining all the methods
    public void clickingOnCustomerLoginButton() { // Method to click on customer login
        clickOnTheElement(customerLoginButton);
    }

    // Method to select customer name from your name-drop down menu
    public void selectingCustomerNameFromYourNameDropDown(String yName) {
        clickOnTheElement(selectYourName);
        selectByVisibleTextFromDropDown(selectYourName, yName);
    }

    public void clickingOnTheLoginButton() { // Method to click on the login button
        clickOnTheElement(loginButton);
    }

    public boolean verifyingTheLogoutTabIsDisplayedOrNot() { // Method to verify the Logout Tab
        boolean isLogoutTabPresent = driver.findElement(By.xpath("//button[@class='btn logout']")).isDisplayed();
        return isLogoutTabPresent;
    }

    public void clickingOnTheLogoutTab() { // Method to click on the logout tab
        clickOnTheElement(logoutTab);
    }
    public void clickingOnTheLoginAfterSelectingCustomerName(){ // Method to click on Login
        clickOnTheElement(customerLogin);
    }

}
