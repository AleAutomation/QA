package br.com.next.Adesao.runner;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.responseSpecification;

import org.hamcrest.Matchers;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.next.Adesao.core.Constantes;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/validarCriacaoAdesao.feature",
		glue = { "br.com.next.Adesao.steps"},
		monochrome = true,
		dryRun = false,
		strict= true)
public class Runner implements Constantes{

	@BeforeClass
	public static void setUp() {
		baseURI = APP_BASE_URL;
		port = APP_PORT;
		basePath = APP_BASE_PATH;
		
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.setContentType(APP_CONTENT_TYPE);
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.requestSpecification = reqBuilder.build();
		
		ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
		resBuilder.expectResponseTime(Matchers.lessThan(MAX_TIMEOUT));
		responseSpecification = resBuilder.build();
	}
}
