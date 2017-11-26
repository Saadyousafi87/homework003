package com.homework.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"features"}, glue= {"com.homework.stepdefs"})

public class Testrunner extends AbstractTestNGCucumberTests {

}
