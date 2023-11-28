package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue =    {"org.example.steps"},
        tags = "@smoke"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}