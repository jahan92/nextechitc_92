package com.nexttechmeta.PageAction;

import com.nexttechmeta.PageLocator.HomePageLocator;

import Utility.Base_Parent;

public class HomePageAction extends Base_Parent {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	
	public void ClickLoginLink() throws Exception {
		
		homePageLocator.LoginLink.click();
		
		Thread.sleep(7000);
		
		
	}
	public void clickNokialumia() {
		homePageLocator.NokiaPhone.click();
		
		
	}
	public void Clickaddtocart() throws InterruptedException {
		homePageLocator.AddToCart.click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}
	public void Clickclickcart() {
		
		homePageLocator.CartLink.click();
		
	}

}
