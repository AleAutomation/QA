package frontatendimento.map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidarCategoriasTratativasBackOfficeMap {
	
	@FindBy(id = "user")
	protected WebElement userTratativas;
	@FindBy(id = "pass")
	protected WebElement senhaTratativas;
	@FindBy(xpath = "//button[text()='CONFIRMAR']")
	protected WebElement btnConfirmar;
}
