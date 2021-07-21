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
	@FindBy(xpath = "//li[@class='menu__list-options__item ng-star-inserted'][4]")
	protected WebElement abaOcorrencias;
	@FindBy(id = "myIframe")
	protected WebElement myIframe;
	@FindBy(xpath = "//section[@class='brq-create-occurrence-container']//span[text()='Histórico']")
	protected WebElement abaHistoricoOcorrencias;
	@FindBy(id = "tn2tpa")
	protected WebElement tn2tpa;
	@FindBy(id = "moldura")
	protected WebElement moldura;
	
}
