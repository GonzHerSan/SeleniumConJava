package com.qa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"com.qa.steps"},
        features = {"src/test/resources/features"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
