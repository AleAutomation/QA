package frontatendimento.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Driver {
	private static WebDriver driver;
	
	@Before
	public static WebDriver getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}

	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://telasnegocio.stf.tu.aznxt.local/tratamentoocorrencias/ocorrencias/tratamento-de-ocorrencia.shtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
/*
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
*/
}
