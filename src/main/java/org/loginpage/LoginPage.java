package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		
	PageFactory.initElements(driver, this);
		}
	@FindBy(id="username")	
	private WebElement txtuser;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement btnlogin;


	public WebElement gettxtuser() {
		return txtuser;
	}
	
	public WebElement gettxtpass() {
		return txtpass;
		
	}
	
	public WebElement getbtnlogin() {
		return btnlogin;
		
	}
	
	@FindBy(id="location")
	private WebElement sellocation;
		

public WebElement getsellocation() {
	return sellocation;
}
     
}