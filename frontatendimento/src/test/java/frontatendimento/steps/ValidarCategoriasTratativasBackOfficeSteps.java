package frontatendimento.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import frontatendimento.core.Utils;
import frontatendimento.page.ValidarCategoriasTratativasBackOfficePage;

public class ValidarCategoriasTratativasBackOfficeSteps {
	
	ValidarCategoriasTratativasBackOfficePage tratBoPage = new ValidarCategoriasTratativasBackOfficePage();
	
	@Dado("^que eu acesse o Tratativas com os dados$")
	public void queEuAcesseTratativasComLogineSenha(DataTable dataTable) throws Throwable {
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		for(int i = 0; i < list.size(); i++) {
			String login = list.get(0).get("login");
			String senha = list.get(0).get("senha");
			tratBoPage.logarTratativas(login, senha);
		}
		Utils.logPrint("Login realizado com sucesso");

	}
	
	@Quando("^eu acessar a aba BackOffice$")
	public void euAcessarAbaBackOffice(DataTable dataTable) {
		List<Map<String, String>> listCategorias = dataTable.asMaps(String.class, String.class);
		for(int i = 0; i < listCategorias.size(); i++) {
			listCategorias.get(i).get("abaTratativasBo");
		}
		tratBoPage.selecionarAba(listCategorias.get(0).get("abaTratativasBo"));
	}

	@Quando("^eu filtrar as opcoes das categorias do Tratativas$")
	public void euFiltrarAsOpcoesDasCategoriasDoTratativas(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listCategorias = dataTable.asMaps(String.class, String.class);
		for(int i = 0; i < listCategorias.size(); i++) {
			listCategorias.get(i).get("jornada");
			listCategorias.get(i).get("produtoServicos");
			listCategorias.get(i).get("assunto");
		}
		tratBoPage.validarJornadaProdServicoAssuntoBO(listCategorias.get(0).get("jornada"), listCategorias.get(0).get("produtoServicos"), listCategorias.get(0).get("assunto"));
		Utils.logPrint("Categorias BackOffice");
	}

	@Entao("^as categorias devem estar com os seus respectivos dados corretos$")
	public void asCategoriasDevemEstarComOsSeusRespectivosDadosCorretos() throws Throwable {

	}
	
	//Ocorrência/TI
	
	@Quando("^eu acessar a aba OcorrenciaTi$")
	public void euAcessarAbaOcorrenciaTi(DataTable dataTable) {
		List<Map<String, String>> listCategorias = dataTable.asMaps(String.class, String.class);
		for(int i = 0; i < listCategorias.size(); i++) {
			listCategorias.get(i).get("abaTratativasTi");
		}
		tratBoPage.selecionarAba(listCategorias.get(0).get("abaTratativasTi"));
		
	}

	@Quando("^eu filtrar as opcoes das categorias de OcorrenciaTi$")
	public void euFiltrarAsOpcoesDasCategoriasDeOcorrenciaTi(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listCategorias = dataTable.asMaps(String.class, String.class);
		for(int i = 0; i < listCategorias.size(); i++) {
			listCategorias.get(i).get("jornadaTi");
			listCategorias.get(i).get("produtoServicosTi");
			listCategorias.get(i).get("assuntoTi");
		}
		tratBoPage.validarJornadaProdServicoAssuntoBO(listCategorias.get(0).get("jornadaTi"), listCategorias.get(0).get("produtoServicosTi"), listCategorias.get(0).get("assuntoTi"));
		Utils.logPrint("Categorias de Ocorrência/TI");
		
		
	}

	@Entao("^as categorias da OcorrenciaTi devem estar com os seus respectivos dados corretos$")
	public void as_categorias_da_OcorrenciaTi_devem_estar_com_os_seus_respectivos_dados_corretos() throws Throwable {

	}
}
