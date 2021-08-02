package frontatendimento.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/validarCategoriasTratativasBoTi.feature",
		glue = { "frontatendimento.steps", "frontatendimento.core"},
		tags = { "@Tratativas" },
		monochrome = true,
		dryRun = false,
		strict= true)
public class Runner {
	

}
