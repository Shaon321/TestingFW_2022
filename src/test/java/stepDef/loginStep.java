package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.login_page;


public class loginStep extends Setup {

    login_page login = new login_page(driver);
   // profile_page profile = new profile_page(driver);

    @Given("I am at TalentTEK Homepage")
    public void iAmAtTalentTEKHomepage() {
        String exp = "Sign In"; // Product Owner -- Stake holders -- Business Anylst
        // Act come from dev team. QA team is the one who is dev code
        String act = driver.getTitle();
        System.out.println(act);
        Assert.assertEquals(act, exp);
    }

    @And("I enter a valid email address")
    public void iEnterAValidEmailAddress() {
        login.enterEmailAddress(hook.email);
    }

    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        login.enterPassword(hook.password);
     }

    @When("I click on Login Button")
    public void iClickOnLoginButton() {
        login.loginButton();
      }
}
