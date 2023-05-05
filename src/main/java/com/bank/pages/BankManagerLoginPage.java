package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    // Storing Bank manager login locator
    By bankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");

    public void clickOnBankManagerButton() { //
        clickOnTheElement(bankManagerLogin);
    }
}
