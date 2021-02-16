package runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author Suresh
 * 
 */

@CucumberOptions(features = {"src/test/java/features"} , plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty",
//		 "pretty",
//       "html:target/cucumber/extent-spark-report.html",
//       "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
        glue = "steps",
        tags = "")
public class TestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
