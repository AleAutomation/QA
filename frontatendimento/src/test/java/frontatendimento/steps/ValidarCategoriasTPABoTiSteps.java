package frontatendimento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import frontatendimento.page.ValidarCategoriasTPABoTiPage;

public class ValidarCategoriasTPABoTiSteps {
	
	ValidarCategoriasTPABoTiPage ocorrenciaBoTiPage = new ValidarCategoriasTPABoTiPage();
	
	@Dado("^que eu acesse a TPA$")
	public void queEuAcesseTPA() throws Throwable {
		ocorrenciaBoTiPage.gerarTokenTpa();
		ocorrenciaBoTiPage.acessarOcorrenciasTPA();
	}

	@Quando("^eu filtrar as opcoes das categorias (.*) e (.*) e (.*)$")
	public void euFiltrarAsOpcoesDasCategorias(String jornada, String prodServico, String assunto) throws Throwable {

	}

	@Entao("^as categorias da TPA devem estar com os seus respectivos dados corretos$")
	public void asCategoriasDaTPADevemEstarComOsSeusRespectivosDadosCorretos() throws Throwable {

	}
	

}
