import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //features = "src/test/java/features/login.feature",

        //features = "src/test/java/features",
        features = "src/test/java/features/signUpByDataTable.feature",
        glue = "stepDef",
        tags = "@signUp",
        plugin = {
                "json:target/cucumber.json"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {

}