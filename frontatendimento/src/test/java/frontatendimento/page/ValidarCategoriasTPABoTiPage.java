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
		basePage.aguardarElementoAparecer(maisInfos, 10);
		basePage.clicarBtn(maisInfos);
		basePage.aguardarElementoAparecer(contParaWeb, 5);
		basePage.clicarBtn(contParaWeb);
		basePage.aguardarElementoAparecer(inputToken, 10);
		basePage.escrever(inputToken, token);
		basePage.clicarBtn(btnTelas20);
		basePage.rolarParaCima();
		basePage.acessarDoisFrames(moldura, tn2tpa);
		basePage.aguardarElementoClicavelAparecer(abaOcorrencias, 15);
		basePage.threadSleep(2000);
		basePage.clicarBtn(abaOcorrencias);
		basePage.sairFrame();
		basePage.acessarTresFrames(moldura, tn2tpa, myIframe);
		basePage.aguardarElementoAparecer(abaHistoricoOcorrencias, 10);
		basePage.clicarBtn(abaHistoricoOcorrencias);
		
		
	}

}
