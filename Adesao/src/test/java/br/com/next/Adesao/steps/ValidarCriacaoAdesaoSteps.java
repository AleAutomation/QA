package br.com.next.Adesao.steps;

import br.com.next.Adesao.tests.ValidarCriacaoAdesaoTests;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class ValidarCriacaoAdesaoSteps {
	
	ValidarCriacaoAdesaoTests validarAdesaoTests = new ValidarCriacaoAdesaoTests();
	
	@Dado("^que eu faca uma requisicao Post Pre Registration (.*)$")
	public void queEuFacaUmaRequisicaoPostPreRegistration(String preRegistrationUrl) throws Throwable {
		validarAdesaoTests.POSTpreRegistration(preRegistrationUrl);
	}

	@Dado("^que eu faca uma requisicao Post User Password (.*)$")
	public void queEuFacaUmaRequisicaoPostUserPassword(String userPasswordUrl) throws Throwable {
		validarAdesaoTests.POSTuserPasswordURL(userPasswordUrl);
	}

	@Dado("^que eu faca uma requisicao Post Login (.*)$")
	public void queEuFacaUmaRequisicaoPostLogin(String loginUrl) throws Throwable {
		validarAdesaoTests.POSTloginURL(loginUrl);
	}

	@Dado("^que eu faca uma requisicao Post Pegar Customer ID (.*)$")
	public void queEuFacaUmaRequisicaoPostPegarCustomerID(String pegarCustomerIdUrl) throws Throwable {
		validarAdesaoTests.POSTpegarCustomerIdURL(pegarCustomerIdUrl);
	}

	@Dado("^que eu faca uma requisicao Put Application (.*)$")
	public void queEuFacaUmaRequisicaoPutApplication(String applicationPutUrl) throws Throwable {
		validarAdesaoTests.PUTapplicationURL(applicationPutUrl);
	}

	@Quando("^eu enviar um video (.*) em uma requisicao Get (.*)$")
	public void euEnviarUmVideoEmUmaRequisicaoGet(String docVideo, String reqGetVideoUrl) throws Throwable {
		validarAdesaoTests.GETenviarVideo(docVideo, reqGetVideoUrl);
	}

	@Quando("^eu enviar os arquivos (.*) em uma requisicao Get (.*)$")
	public void euEnviarOsArquivosEmUmaRequisicaoGet(String docArquivos, String reqGetArqUrl) throws Throwable {
		validarAdesaoTests.GETenviarArquivos(docArquivos, reqGetArqUrl);
	}

}
