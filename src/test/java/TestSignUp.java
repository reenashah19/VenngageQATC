package test.java;

import main.objects.Account;
import main.pages.SignUpPage;
import main.pages.TemplatesPage;

public class TestSignUp {
		
	private SignUpPage signUpPage;
	private TemplatesPage templatePage;
	
	@Before
	public void setUp(){
		// Instantiate page objects here	
		
		signUpPage = new SignUpPage();
		templatePage = new TemplatesPage();
		
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		templatePage.NavigateToPage("https://venngage.com/templates");
		templatePage.VerifyText("Create");
		templatePage.ClickOnsignUp();
		signUpPage.CreateAccount();
		signUpPage.VerifyAccountIsCreated();
	}
}
