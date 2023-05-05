package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    // Storing all the locators
    // Storing Deposit button locator
    By depositButton = By.xpath("//button[normalize-space()='Deposit']");
    // Storing amount entering text box locator
    By enterAmount = By.xpath("//input[@placeholder='amount']");
    // Storing the deposit button locator to be clicked after sending the amount
    By depositButtonAfterAmount = By.xpath("//button[@type='submit']");
    // Storing the Withdrawal button locator
    By withdrawButton = By.xpath("//button[normalize-space()='Withdrawl']");
    // Storing the withdrawal amount text box locator
    By enterWithdrawalAmount = By.xpath("//input[@placeholder='amount']");
    // Storing the withdrawal button after entering the withdrawal amount
    By withdrawalButton = By.xpath("//button[@type='submit']");

    // Defining all the methods
    public void clickingOnTheDepositButton() { // Method to click on the deposit button
        clickOnTheElement(depositButton);
    }

    public void enteringTheAmountInToTheAmountTextBox(int amount) { // Method to enter the required amount
        sendTextToElement(enterAmount, String.valueOf(amount));
    }

    public void clickingOnDepositButtonAfterEnteringTheAmount() {
        clickOnTheElement(depositButtonAfterAmount);
    }

    public void clickingOnTheWithdrawButton() { // Method to click on withdraw button
        clickOnTheElement(withdrawButton);
    }

    public void enteringTheWithdrawalAmountInToTheAmountTextBox(int withdrawAmount) { // Method to enter withdrawal amount
        sendTextToElement(enterWithdrawalAmount, String.valueOf(withdrawAmount));
    }
    public void clickingOnTheWithdrawButtonAfterEnteringTheAmount(){ // Method to click on withdraw button
        clickOnTheElement(withdrawalButton);
    }
}
