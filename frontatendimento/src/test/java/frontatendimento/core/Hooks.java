package frontatendimento.core;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.responseSpecification;

import org.hamcrest.Matchers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;


public class Hooks implements Constantes{
	private static ExtentHtmlReporter htmlReport;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;
		
	@Before
	public void beforeCenario(Scenario cenario) {
		
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
	
        given()
        	.keyStore("C:\\Users\\alexsandroramos\\eclipse-workspace\\frontatendimento\\src\\test\\resources\\certificates\\ugen2.pfx", "genesys")
       
    	.then()
    		.expect().spec(resBuilder.build())
    	.when()
    		.get("https://api.int.tu.aznxt.local");
		
		if(extentReport == null) {
			extentReport = new ExtentReports();
			htmlReport = new ExtentHtmlReporter("src/test/resources/prints/htmlReporter.html");
			extentReport.attachReporter(htmlReport);
			
		}
		
		extentTest = extentReport.createTest(cenario.getId());	
	}
		
	@After
	public void afterCenario(Scenario cenario) {
		if(cenario.isFailed()) {
		extentTest.log(Status.FAIL, "Cenário: " + cenario.getName() + " executado com falhas!");
		extentReport.flush();
		}else {
			extentTest.log(Status.PASS, "Cenário: " + cenario.getName() + " executado com sucesso!");
			extentReport.flush();			
		}
	}
	
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
}
