package br.com.next.Adesao.core;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.responseSpecification;

import org.hamcrest.Matchers;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class BaseTest implements Constantes {
	
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
		
        given()
        	.keyStore("C:\\Users\\alexsandroramos\\eclipse-workspace\\Adesao\\src\\test\\resources\\certificates\\ugen2.pfx", "genesys")
       
    	.then()
    		.expect().spec(resBuilder.build())
    	.when()
    		.get("https://api.int.tu.aznxt.local");
		
	}

}
