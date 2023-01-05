package StepDeffination;

import com.nexttechmeta.PageAction.CartPageAction;
import com.nexttechmeta.PageAction.HomePageAction;
import com.nexttechmeta.PageAction.LoginPageAction;

import Utility.Base_Parent;
import Utility.MetaUtility;
import cucumber.api.java.en.Then;

public class Cartt extends Base_Parent{
	
	HomePageAction homePageAction = new HomePageAction();

	CartPageAction cartPageAction = new CartPageAction();
	
	@Then("^click Nokia lumia$")
	public void click_Nokia_lumia() throws Throwable {
		homePageAction.clickNokialumia();
	}

	@Then("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
		homePageAction.Clickaddtocart();
	}
	@Then("^Click click cart$")
	public void click_click_cart() throws Throwable {
		homePageAction.Clickclickcart();
	}

	@Then("^Verify item added in cart$")
	public void verify_item_added_in_cart() throws Throwable {
		cartPageAction.Verifyitemaddedincart();
		MetaUtility.takeMyScreenshot(driver, "Cart Page");
	}

}
