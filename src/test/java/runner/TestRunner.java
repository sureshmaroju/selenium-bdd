package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * @author Suresh
 * 
 */

@CucumberOptions(features = {"src/test/java/features"} , plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
