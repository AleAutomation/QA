package frontatendimento.page;

import org.openqa.selenium.support.PageFactory;

import frontatendimento.core.BasePage;
import frontatendimento.core.Driver;
import frontatendimento.core.Utils;
import frontatendimento.map.ValidarCategoriasTratativasBoTiMap;

public class ValidarCategoriasTratativasBackOfficePage extends ValidarCategoriasTratativasBoTiMap{
	
	public ValidarCategoriasTratativasBackOfficePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	BasePage basePage = new BasePage();

	public void logarTratativas(String login, String senha) {
		basePage.aguardarElementoAparecer(userTratativas, 10);
		basePage.escrever(userTratativas, login);
		basePage.escrever(senhaTratativas, senha);
		basePage.clicarBtn(btnConfirmar);
		basePage.aguardarElementoAparecer(abaBackOffice, 10);
		if(basePage.pegarTexto(abaBackOffice).equalsIgnoreCase("Backoffice")) {
			Utils.logPass("Login BackOffice");
		}else {
			Utils.logFail("Login BackOffice falhou!");
		}
	}
	
	public void validarJornadaProdServicoAssuntoBO(String jornada, String prodServico, String assunto) {
		basePage.threadSleep(2000);
		basePage.clicarBtn(btnBuscaAvancada);
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
			Utils.logPass("Produto/Servi�o selecionado");
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
