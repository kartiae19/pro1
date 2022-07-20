package org.browserlaunch1;

import org.baseclass.BaseClass;
import org.loginpage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends BaseClass {
	
	

	

	private static WebElement txtuser;

	public static void main(String[] args) {
		chromeBrowser();
		urllaunch("http://adactinhotelapp.com/");
		maximize();
		implicitwait(20);
		
	    LoginPage l=new LoginPage();
	    SendKeys(l.gettxtuser(),"Karti123");
	    SendKeys(l.gettxtpass(),"karthika@123");
	    click(l.getbtnlogin());
	    
	    
	    
	    
	    
	    
	}

	
		
	}


	
	


