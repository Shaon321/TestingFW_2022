package stepDef;

import base.Setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class hook extends Setup {
    public static String email;
    public static String password;
    public static String envData = System.getProperty("env");
    public static String driverType = System.getProperty("browser");
    public static String url;

    @Before
    public void startTest() {
        //happen before each test scenario
        // setup default browser
        if (Strings.isNullOrEmpty(driverType)) {
            driverType = "ch";
        }
        // default env
        if (Strings.isNullOrEmpty(envData)) {
            envData = "qa";
        }
        driver = setupBrowser(driverType);
        switch (envData) {
            case "qa":
                url = "http://qa.taltektc.com";
                email = "Abc321@gmail.com";
                password = "Abc1234";
                break;
            case "stg":
                url = "http://stage.taltektc.com";
                email = "Abc321@gmail.com";
                password = "Abc1234";
                break;
            case "prd":
                url = "http://prod.taltektc.com";
                break;
        }
        driver.get(url);
    }

    @After
    public void endTest(Scenario scenario) {
        // happen after each test
        // what happen if test fails? what you will do for the  failing test case? screenshot? logs? ??
        try {
            if (scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                // embed it in the report.
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } finally {
            //driver.quit();
        }
    }
}
