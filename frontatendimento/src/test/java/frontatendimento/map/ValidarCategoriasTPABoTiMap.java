package frontatendimento.map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidarCategoriasTPABoTiMap {
	
	@FindBy(id = "formIdentificarCliente:token")
	protected WebElement inputToken;
	@FindBy(id = "moreInfoContainer")
	protected WebElement maisInfos;
	@FindBy(id = "overridelink")
	protected WebElement contParaWeb;
	@FindBy(id = "btnTPA")
	protected WebElement btnTpa;
	@FindBy(id = "btnCallTn2")
	protected WebElement btnTelas20;
	@FindBy(xpath = "//a[text()='Ocorrências']")
	protected WebElement abaOcorrencias;
	@FindBy(id = "myIframe")
	protected WebElement myIframe;
	@FindBy(xpath = "//span[text()='Histórico']")
	protected WebElement abaHistoricoOcorrencias;
	@FindBy(id = "tn2tpa")
	protected WebElement tn2tpa;
	@FindBy(id = "moldura")
	protected WebElement moldura;
	@FindBy(id = "func")
	protected WebElement funcionalidadeEmulador;
	@FindBy(id = "textAreaToken")
	protected WebElement textAreaToken;
	@FindBy(xpath = "//button[text()='Redirecionar']")
	protected WebElement btnRedirecionar;
	@FindBy(id = "frame-container")
	protected WebElement frameContainer;
	@FindBy(xpath = "//div[@class='modal-close ng-star-inserted']//button[text()='FECHAR']")
	protected WebElement btnFecharContainer;
	@FindBy(xpath = "//span[text()='BackOffice']")
	protected WebElement checkBackOffice;
	@FindBy(xpath = "//div[@class='spinner-three-bounce']")
	protected WebElement spinnerThreeBounce;
}
