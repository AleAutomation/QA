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
	}
	
	public void selecionarAba(String abaTratativas) {
		switch (abaTratativas) {
		case "Backoffice":
		basePage.aguardarElementoAparecer(abaBackOffice, 10);
		if(basePage.pegarTexto(abaBackOffice).equalsIgnoreCase("Backoffice")) {
			Utils.logPass("Login BackOffice");
			basePage.threadSleep(2000);
			basePage.clicarBtn(btnBuscaAvancadaBo);
		}else {
			Utils.logFail("Login BackOffice falhou!");
		}
		break;
		
		case "Ocorrência/TI":
			basePage.aguardarElementoAparecer(abaOcorrenciaTi, 10);
			basePage.threadSleep(2000);
			basePage.clicarBtn(abaOcorrenciaTi);
			if(basePage.pegarTexto(abaOcorrenciaTi).equalsIgnoreCase("Ocorrência/TI")) {
				Utils.logPass("Login OcorrênciaTI");
				basePage.threadSleep(2000);
				basePage.clicarBtn(btnBuscaAvancadaTi);
			}else {
				Utils.logFail("Login OcorrênciaTI falhou!");
			}
			break;
			
		default: 
			System.out.println("Não foi possível selecionar a aba");
		}
	}
	
	public void validarJornadaProdServicoAssuntoBO(String jornada, String produtoServicos, String assunto) {
		basePage.clicarBtn(jornadaTratativas);
		String validarJornada = basePage.selecionarOpcaoLista(jornada);
		if(validarJornada.equalsIgnoreCase(jornada)) {
			Utils.logPass("Jornada selecionada");
		}else {
			Utils.logFail("Erro ao selecionar as categorias");
		}
		basePage.clicarBtn(prodServicoTratativas);
		String validarprodServico = basePage.selecionarOpcaoLista(produtoServicos);
		if(validarprodServico.equalsIgnoreCase(produtoServicos)) {
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
