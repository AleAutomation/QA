package frontatendimento.page;

import org.openqa.selenium.support.PageFactory;

import frontatendimento.core.BasePage;
import frontatendimento.core.Driver;
import frontatendimento.map.ValidarCategoriasTratativasBackOfficeMap;

public class ValidarCategoriasTratativasBackOfficePage extends ValidarCategoriasTratativasBackOfficeMap{
	
	public ValidarCategoriasTratativasBackOfficePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	BasePage basePage = new BasePage();

	public void logarTratativas(String login, String senha) {
		basePage.aguardarElementoAparecer(userTratativas, 10);
		userTratativas.sendKeys(login);
		senhaTratativas.sendKeys(senha);
		btnConfirmar.click();
	}
}
