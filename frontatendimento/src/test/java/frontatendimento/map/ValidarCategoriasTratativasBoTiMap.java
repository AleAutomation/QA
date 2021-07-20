package frontatendimento.map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidarCategoriasTratativasBoTiMap {
	
	@FindBy(id = "user")
	protected WebElement userTratativas;
	@FindBy(id = "pass")
	protected WebElement senhaTratativas;
	@FindBy(xpath = "//button[text()='CONFIRMAR']")
	protected WebElement btnConfirmar;
	@FindBy(id = "mat-tab-label-0-0")
	protected WebElement abaBackOffice;
	@FindBy(xpath = "//button[text()=' Busca Avançada ']")
	protected WebElement btnBuscaAvancada;
	@FindBy(xpath = "//span[text()='JORNADA']")
	protected WebElement jornadaTratativas;
	@FindBy(xpath = "//span[text()='PRODUTO/SERVIÇO']")
	protected WebElement prodServicoTratativas;
	@FindBy(xpath = "//span[text()='ASSUNTO']")
	protected WebElement assuntoTratativas;
	@FindBy(id = "mat-tab-label-0-1")
	protected WebElement abaOcorrenciaTi;
	@FindBy(xpath = "//button[text()='Busca Avançada']")
	protected WebElement buscaAvancadaOcorrenciaTi;
}
