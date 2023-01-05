package com.nexttechmeta.PageAction;

import com.nexttechmeta.PageLocator.LoginPageLocator;

import Utility.Base_Parent;

public class LoginPageAction extends Base_Parent{
	
	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
	
	
	public void metaLoginCard(String u, String p) {
		
		loginPageLocator.UserName.sendKeys(u);
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator .LobinButton.click();
		
		
		
		
	}

}
