package frontatendimento.page;

import org.openqa.selenium.support.PageFactory;

import frontatendimento.core.BasePage;
import frontatendimento.core.Driver;
import frontatendimento.core.Utils;
import frontatendimento.map.ValidarCategoriasTratativasBoTiMap;

public class ValidarCategoriasTratativasOcorrenciaTiPage extends ValidarCategoriasTratativasBoTiMap{
	public ValidarCategoriasTratativasOcorrenciaTiPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	BasePage basePage = new BasePage();
	
	public void loginTratativasOcorrenciasTi(String login, String senha) {
		basePage.aguardarElementoAparecer(userTratativas, 10);
		basePage.escrever(userTratativas, login);
		basePage.escrever(senhaTratativas, senha);
		basePage.clicarBtn(btnConfirmar);
	}
	public void validarJornadaProdServicoAssuntoTi(String jornada, String prodServico, String assunto) {
		basePage.aguardarElementoClicavelAparecer(abaOcorrenciaTi, 10);
		basePage.threadSleep(2000);
		basePage.clicarBtn(abaOcorrenciaTi);
		basePage.threadSleep(2000);
		basePage.clicarBtn(buscaAvancadaOcorrenciaTi);
		basePage.clicarBtn(jornadaTratativas);
		String validarJornada = basePage.selecionarOpcaoLista(jornada);
		if(validarJornada.equalsIgnoreCase(jornada)) {
			Utils.logPass("Jornada selecionada");
		}else {
			Utils.logFail("Erro ao selecionar as categorias");
		}
		basePage.clicarBtn(prodServicoTratativas);
		String validarprodServico = basePage.selecionarOpcaoLista(prodServico);
		if(validarprodServico.equalsIgnoreCase(prodServico)) {
			Utils.logPass("Produto/Serviço selecionado");
		}else {
			Utils.logFail("Erro ao selecionar as categorias");
		}		
		basePage.clicarBtn(assuntoTratativas);
		String validarAssunto = basePage.selecionarOpcaoLista(assunto);
		if(validarAssunto.equalsIgnoreCase(assunto)) {
			Utils.logPass("Assunto selecionado");
		}else {
			Utils.logFail("Erro ao selecionar as categorias");
		}		
	}
}
