package test.java;

import main.objects.Account;
import main.pages.SignUpPage;
import main.pages.TemplatesPage;

public class TestSignUp {
	
	private Account account;
	private SignUpPage signUpPage;
	private TemplatesPage templatePage;
	
	@Before
	public void setUp(){
		// Instantiate page objects here
		account = new Account(firstName, lastName, email, password)
		signUpPage = new SignUpPage();
		templatePage = new TemplatesPage();
		
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		selenium.goToUrl("https://venngage.com/templates");
		templatePage.VerifyText("Create");
		templatePage.ClickOnsignUp();
		
	}
}
