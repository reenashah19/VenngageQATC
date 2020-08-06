package main.pages;

import org.openqa.selenium.By;

import main.util.Selenium;

public class TemplatesPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String Template = "//div[contains(@class,'templates__hoverSettings-')]";
	private static final String ButtonCreate = "//button[@data-hover='Sign Up']";
	
	public TemplatesPage(){
		this.selenium = Selenium();
	}
	
	// Create a function that clicks on the Sign Up button
	
	public void ClickOnsignUp() {
		selenium.mousehover(Template);
		selenium.clickByXpath(ButtonCreate);
	}
	
	public void VerifyText(String data) {
		driver.findElement(By.xpath(ButtonCreate)).getText().equals(data);
	}
	
	
}