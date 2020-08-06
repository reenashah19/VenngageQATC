package main.pages;

import main.objects.Account;
import main.util.Selenium;

public class SignUpPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String firstNameInput = "//input[@name='first_name']";
	private static final String lastNameInput = "//input[@name='last_name']";
	private static final String emailInput = "//input[@name='email']";
	private static final String passwordInput = "//input[@name='password']";
	private static final String signUpButton = "//button[@id='btn_register']";
	private static final String accountProfile = "//li[@id='account-button']";
	private Account account;
	
	public SignUpPage(){
		this.selenium = new Selenium();
		this.account = new Account("QA", "Test",  "qa."+System.currentTimeMillis()+"@venngage.com", "123456");
	}
	
	// Create a function that takes an Account and simulates signing up using Selenium actions. (Refer to Selenium.java)
	public void CreateAccount() {
		selenium.sendKeys(firstNameInput, account.getFirstName());
		selenium.sendKeys(lastNameInput, account.getLastName());
		selenium.sendKeys(emailInput, account.getEmail());
		selenium.sendKeys(passwordInput, account.getPassword());
		selenium.clickByXpath(signUpButton);
	}
	
	public void VerifyAccountIsCreated() {
		selenium.elementPresent(accountProfile);
	}
}