package main.pages;

import org.openqa.selenium.By;

import main.util.Selenium;

public class TemplatesPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String template = "//div[contains(@class,'templates__hoverSettings-')]";
	private static final String createButton = "//button[@data-hover='Sign Up']";
	
	public TemplatesPage(){
		this.selenium = new Selenium();
	}
	
	// Create a function that clicks on the Sign Up button
	
	public void ClickOnsignUp() {
		selenium.mousehover(template);
		selenium.clickByXpath(createButton);
	}
	
	public void VerifyText(String data) {
		selenium.verfiyText(createButton, data);		
	}
	
	public void NavigateToPage(String page) {
		selenium.goToUrl(page);
	}
	
}