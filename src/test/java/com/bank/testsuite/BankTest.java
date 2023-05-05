package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage(); // Object creation of BankManagerLoginPage
    AddCustomerPage addCustomerPage = new AddCustomerPage(); // Object creation of AddCustomerPage
    OpenAccountPage openAccountPage = new OpenAccountPage(); // Object creation of OpenAccountPage
    CustomerLoginPage customerLoginPage = new CustomerLoginPage(); // Object creation of CustomerLoginPage
    AccountPage accountPage = new AccountPage(); // Object creation of AccountPage

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.clickOnBankManagerButton(); // Clicking on the bank manager button
        addCustomerPage.clickingOnAddCustomerButton(); // Clicking on Add customer button
        addCustomerPage.enteringFirstNameInToFirstNameField("ABC"); // Sending first name
        addCustomerPage.enteringLastNameInToLastNameField("XYZ"); // Sending last name
        addCustomerPage.enteringPostCodeInToPostCodeField("SW62EL"); // Sending postcode
        addCustomerPage.clickingOnAddCustomer(); // Clicking on add customer to create a new record
        String expectedAlertText = "Customer added successfully with customer ";
        Alert alert = driver.switchTo().alert(); // Creating alert object reference and switch to alert
        String actualAlertText = alert.getText().substring(0, 42); // Storing the alert message and Trimming it to compare with the expected message
        Assert.assertEquals(actualAlertText, expectedAlertText, "Invalid Message Prompt...!!!"); // Comparing both messages
        alert.accept(); // Clicking on OK into the alert window
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        bankManagerLoginPage.clickOnBankManagerButton(); // Clicking on Bank manager button
        openAccountPage.clickingOnTheOpenAccountButton(); // Clicking on Open account button
        openAccountPage.selectingCreatedCustomerFromTheCustomerNameDropDown("Hermoine Granger"); // Selecting the customer name
        openAccountPage.selectingTheCurrencyFromCurrencyDropDown("Pound"); // Selecting the pound currency
        openAccountPage.clickingOnTheProcessButton(); // Clicking on the process button
        Alert alert = driver.switchTo().alert(); // Creating alert object reference and switch to alert
        String expectedAlertText = "Account created successfully";
        String actualAlertText = alert.getText().substring(0, 28);
        Assert.assertEquals(actualAlertText, expectedAlertText, "Invalid Message Prompt...!!!");
        alert.accept();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        customerLoginPage.clickingOnCustomerLoginButton(); // Clicking on customer login button
        customerLoginPage.selectingCustomerNameFromYourNameDropDown("Hermoine Granger");
        customerLoginPage.clickingOnTheLoginButton(); // Clicking on the login button
        customerLoginPage.verifyingTheLogoutTabIsDisplayedOrNot(); // Verifying the logout tab
        customerLoginPage.clickingOnTheLogoutTab(); // Clicking on the logout tab
        String actualText = driver.findElement(By.xpath("//label[normalize-space()='Your Name :']")).getText();
        Assert.assertEquals(actualText, "Your Name :", "Invalid Message Prompt...!!!");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        customerLoginPage.clickingOnCustomerLoginButton(); // Clicking on customer login button
        customerLoginPage.selectingCustomerNameFromYourNameDropDown("Hermoine Granger");
        customerLoginPage.clickingOnTheLoginAfterSelectingCustomerName(); // Clicking on the login button
        accountPage.clickingOnTheDepositButton(); // Clicking on the deposit button
        accountPage.enteringTheAmountInToTheAmountTextBox(100); // Entering the required amount
        accountPage.clickingOnDepositButtonAfterEnteringTheAmount(); // Clicking on the deposit button
        String expectedDepositText = "Deposit Successful";
        String actualDepositText = driver.findElement(By.xpath("//span[@class='error ng-binding']")).getText();
        Assert.assertEquals(actualDepositText, expectedDepositText, "Invalid Transaction Text...!!!");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        customerLoginPage.clickingOnCustomerLoginButton(); // Clicking on customer login button
        customerLoginPage.selectingCustomerNameFromYourNameDropDown("Hermoine Granger");
        customerLoginPage.clickingOnTheLoginAfterSelectingCustomerName(); // Clicking on the login button
        accountPage.clickingOnTheWithdrawButton(); // Clicking on the withdrawal button
        accountPage.enteringTheWithdrawalAmountInToTheAmountTextBox(50);
        accountPage.clickingOnTheWithdrawButtonAfterEnteringTheAmount(); // Clicking on withdraw
        String expectedWithdrawText = "Transaction successful";
        String actualWithdrawText = driver.findElement(By.xpath("//span[@class='error ng-binding']")).getText();
        Assert.assertEquals(actualWithdrawText, expectedWithdrawText, "Invalid Transaction Text...!!!");
    }
}
