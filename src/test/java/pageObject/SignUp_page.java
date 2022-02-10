package pageObject;

import base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUp_page extends Setup {
    public SignUp_page (WebDriver driver){
        PageFactory.initElements(driver,this);
        Setup.driver = driver;
    }

    @FindBy(how = How.CLASS_NAME, using = "new-account")
    public WebElement createNewAcctBtn;

    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstName;

    @FindBy(how = How.NAME, using = "lastName")
    public WebElement lastName;

    @FindBy(how = How.NAME, using = "email")
    public WebElement email;

    @FindBy(how = How.NAME, using = "password")
    public WebElement password;

    @FindBy(how = How.NAME, using = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy (how = How.NAME, using = "month")
    public WebElement month;

    @FindBy(how = How.NAME, using = "day")
    public WebElement day;

    @FindBy(how = How.NAME, using = "year")
    public WebElement year;

    @FindBy(how = How.ID, using ="male")
    public WebElement male;

    @FindBy(how = How.NAME, using ="agree")
    public WebElement agree;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement CreateMyAccount;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success']")
    public WebElement thankYouMsg;

    public void clickNewAcctBtn(){
        createNewAcctBtn.click();
        System.out.println("Clicked create new account button successfully");
    }
    public void enterFirstName(String FirstName){
        firstName.clear();
        firstName.sendKeys(FirstName);
    }
    public void enterLastName(String LastName){
        lastName.clear();
        lastName.sendKeys(LastName);
    }
    public void enterEmail(String Email){
        email.clear();
        email.sendKeys(Email);
    }

    public void enterPassword(String Password){
        password.clear();
        password.sendKeys(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword){
        confirmPassword.clear();
        confirmPassword.sendKeys(ConfirmPassword);
    }

    public void enterMonth(String Month){
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText(Month);
        System.out.println("Select month as " + Month);
    }
    public void enterDay(String Day){
        Select selectDay = new Select(day);
        selectDay.selectByVisibleText(Day);
        System.out.println("Select day as " + Day);
    }

    public void enterYear(String Year){
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText(Year);
        System.out.println("Select year as " + Year);
    }
    public void selectMale(){
        male.click();
    }

    public void agreeChkBox(){
        agree.click();
    }

    public void clickCreateMyAcct(){
       CreateMyAccount.click();
    }

    public void getThankYouMsg(){
        String act = thankYouMsg.getText().substring(0,21);
        System.out.println(act);
        String exp = "Thank you for sign up";
        //Assert.assertEquals(exp, act);
        if(act.equalsIgnoreCase("Thank you for sign up")){
            System.out.println("No Error! New registration successfull");
        }
        else{
            System.out.println("Validation Error");
        }

    }
}

