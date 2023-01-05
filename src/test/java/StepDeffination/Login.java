package StepDeffination;

import com.nexttechmeta.PageAction.AccountPageAction;
import com.nexttechmeta.PageAction.HomePageAction;
import com.nexttechmeta.PageAction.LoginPageAction;

import Utility.Base_Parent;
import Utility.MetaUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends Base_Parent{
	
	HomePageAction homePageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction();
	AccountPageAction sccountPageAction =new AccountPageAction();
	
	@Given("^MetaLunch \"([^\"]*)\"$")
	public void metalunch(String URL) throws Throwable {
		metaLaunchURL(URL);
	    
	}
	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
		homePageAction.ClickLoginLink();
	}

	@Then("^Enter Username and Enter Pasword and Click Login button$")
	public void enter_Username_and_Enter_Pasword_and_Click_Login_button() throws Throwable {
		loginPageAction.metaLoginCard(metaprop.getProperty("UserName1"), metaprop.getProperty("password1"));
	}

	@Then("^Verify user can login with valid card$")
	public void verify_user_can_login_with_valid_card() throws Throwable {
		sccountPageAction.Verifyusercanloginwithvalidcard();
		MetaUtility.takeMyScreenshot(driver, "Account Profile Page");
		
	}


}
