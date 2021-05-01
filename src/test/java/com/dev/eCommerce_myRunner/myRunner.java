package com.dev.eCommerce_myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		  features = {"E:/DS&ALGO/ECommerce_BDD_Automation_FrameWork/src/test/resources/Features/check.feature"},
		  glue = {"com.dev.eCommerce_StepDefinations"},
		  plugin = {"pretty"},
		  monochrome = false,
		  dryRun = false
		
		
		)

public class myRunner {

}
