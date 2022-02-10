package stepDef;

import base.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SignUp_page;

public class signUpStep extends Setup {

    SignUp_page SP = new SignUp_page(driver);

    @Given("User in a TalentTEK homepage")
    public void userInATalentTEKHomepage() {
        System.out.println("User in a TalentTEK homepage");
    }

    @When("User click on New Account button")
    public void userClickOnNewAccountButton() {
        System.out.println("User click on New Account button");
        SP.clickNewAcctBtn();
    }

    @Then("user should land on Sign Pp page")
    public void userShouldLandOnSignPpPage() {
        System.out.println("User should land on Sign-Up page");
    }

    @Then("user should fill out the information below")
    public void userShouldFillOutTheInformationBelow(DataTable dataTable) {
        SP.enterFirstName(dataTable.cell(1,0));
        SP.enterLastName(dataTable.cell(1,1));
        SP.enterEmail(dataTable.cell(1,2));
        SP.enterPassword(dataTable.cell(1,3));
        SP.enterConfirmPassword(dataTable.cell(1,4));
        SP.enterMonth(dataTable.cell(1,5));
        SP.enterDay(dataTable.cell(1,6));
        SP.enterYear(dataTable.cell(1,7));
        //Below for the 2nd user
        SP.enterFirstName(dataTable.cell(2,0));
        SP.enterLastName(dataTable.cell(2,1));
        SP.enterEmail(dataTable.cell(2,2));
        SP.enterPassword(dataTable.cell(2,3));
        SP.enterConfirmPassword(dataTable.cell(2,4));
        SP.enterMonth(dataTable.cell(2,5));
        SP.enterDay(dataTable.cell(2,6));
        SP.enterYear(dataTable.cell(2,7));

    }

    @And("user select the radio button for Gender")
    public void userSelectTheRadioButtonForGender() {
        SP.selectMale();
    }

    @And("user click on checkbox for Agreement")
    public void userClickOnCheckboxForAgreement() {
    SP.agreeChkBox();
    }

    @When("user click on Create New account")
    public void userClickOnCreateNewAccount() {
        System.out.println("user already created an account");
        SP.clickCreateMyAcct();
    }

    @Then("user should be able to Create account successfully")
    public void userShouldBeAbleToCreateAccountSuccessfully() {
        //SP.getThankYouMsg();
    }
}
