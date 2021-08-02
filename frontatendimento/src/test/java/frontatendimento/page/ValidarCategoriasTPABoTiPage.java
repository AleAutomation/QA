package frontatendimento.page;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.support.PageFactory;

import frontatendimento.core.BasePage;
import frontatendimento.core.Constantes;
import frontatendimento.core.Driver;
import frontatendimento.map.ValidarCategoriasTPABoTiMap;

public class ValidarCategoriasTPABoTiPage extends ValidarCategoriasTPABoTiMap implements Constantes{
	
	public ValidarCategoriasTPABoTiPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	private static String token;
	
	BasePage basePage = new BasePage();
	
	public void gerarTokenTpa() {
		token = given()
			.log().all()
			.headers("Content-Type", "application/json")
			.headers("Accept", "application/json")
			.headers("coreIp","pbi-46852")
		.when()
			.body("{\"cpf\": \"66241855034\",\"host\": \"D4253E7895\",\"agentId\": \"I932050\",\"password\": \"testejul\"}")
			.log().all()
			.post(APP_BASE_URL + "/v1/login/csr")
		.then()
			.log().all()
			.statusCode(200)
			.extract().body().path("token")
			
		;
		
	}

	public void acessarOcorrenciasTPA() {
		basePage.sairFrame();
		basePage.aguardarElementoAparecer(btnRedirecionar, 10);
		basePage.escrever(funcionalidadeEmulador, "2");
		basePage.escrever(textAreaToken, token);
		basePage.clicarBtn(btnRedirecionar);
		basePage.aguardarElementoAparecer(frameContainer, 10);
		if(basePage.isDisplayed(frameContainer)) {
			basePage.acessarFrame(frameContainer);
			basePage.clicarBtn(btnFecharContainer);
		}
		basePage.sairFrame();
		basePage.acessarDoisFrames(frameContainer, myIframe);
		basePage.aguardarElementoDesaparecer(spinnerThreeBounce, 10);
		basePage.sairFrame();
		basePage.acessarFrame(frameContainer);
		basePage.aguardarElementoClicavelAparecer(abaOcorrencias, 15);
		basePage.clicarBtn(abaOcorrencias);
		basePage.sairFrame();
		basePage.acessarDoisFrames(frameContainer, myIframe);
		basePage.aguardarElementoAparecer(checkBackOffice, 10);
		basePage.clicarBtn(checkBackOffice);
	}

}
