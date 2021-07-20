package frontatendimento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import frontatendimento.core.Utils;
import frontatendimento.page.ValidarCategoriasTratativasOcorrenciaTiPage;

public class ValidarCategoriasTratativasOcorrenciaTiSteps {
	
	ValidarCategoriasTratativasOcorrenciaTiPage ocorrenciaTiPage = new ValidarCategoriasTratativasOcorrenciaTiPage();

	@Dado("^que eu acesse o Tratativas OcorrenciasTi com o (.*) e (.*)$")
	public void queEuAcesseTratativasOcorrenciasTi(String login, String senha) {
		ocorrenciaTiPage.loginTratativasOcorrenciasTi(login, senha);
		Utils.logPrint("Login realizado com sucesso!");
	}

	@Quando("^eu filtrar as opcoes das categorias de OcorrenciaTi (.*) e (.*) e (.*)$")
	public void euFiltrarAsOpcoesDasCategoriasDeOcorrenciaTi(String jornada, String prodServico, String assunto) {
		ocorrenciaTiPage.validarJornadaProdServicoAssuntoTi(jornada, prodServico, assunto);
		Utils.logPrint("Categorias OcorrênciaTi selecionadas");

	}

	@Entao("^as categorias da OcorrenciaTi devem estar com os seus respectivos dados corretos$")
	public void asCategoriasDaOcorrenciaTiDevemEstarComOsSeusRespectivosDadosCorretos() {

	}
}
