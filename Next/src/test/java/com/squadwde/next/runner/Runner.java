package com.squadwde.next.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/acessarAnotacao.feature",
		glue = { "com.squadwde.next.steps",  "com.squadwde.next.core"},
		tags = { "@anotacao" },
		monochrome = true,
		dryRun = false,
		strict= true)
public class Runner {

}
