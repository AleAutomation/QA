package frontatendimento.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/validarCategoriasTPABoTi.feature",
		glue = { "frontatendimento.steps", "frontatendimento.core"},
		tags = { "@tpaBackOffice" },
		monochrome = true,
		dryRun = false,
		strict= true)
public class Runner {
	

}
