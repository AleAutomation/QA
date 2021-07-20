package frontatendimento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import frontatendimento.core.Utils;
import frontatendimento.page.ValidarCategoriasTratativasBackOfficePage;

public class ValidarCategoriasTratativasBackOfficeSteps {
	
	ValidarCategoriasTratativasBackOfficePage tratBoPage = new ValidarCategoriasTratativasBackOfficePage();
	
	@Dado("^que eu acesse o Tratativas com o (.*) e (.*)$")
	public void queEuAcesseTratativasComLogineSenha(String login, String senha) throws Throwable {
		tratBoPage.logarTratativas(login, senha);
		Utils.logPrint("Login realizado com sucesso");

	}

	@Quando("^eu filtrar as opcoes das categorias BackOffice (.*) e (.*) e (.*)$")
	public void euFiltrarAsOpcoesDasCategoriasBackOffice(String jornada, String prodServico, String assunto) throws Throwable {
		tratBoPage.validarJornadaProdServicoAssuntoBO(jornada, prodServico, assunto);
		Utils.logPrint("Categorias BackOffice");

	}

	@Entao("^as categorias devem estar com os seus respectivos dados corretos$")
	public void asCategoriasDevemEstarComOsSeusRespectivosDadosCorretos() throws Throwable {

	}
}
