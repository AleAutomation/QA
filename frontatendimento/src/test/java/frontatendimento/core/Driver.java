package frontatendimento.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	private static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		if(driver == null) {
			createIeDriver();
		}
		return driver;
	}
	

	public static void createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://telasnegocio.stf.tu.aznxt.local/central-relacionamento-web/moldura/moldura.xhtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void createIeDriver() {
		System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer32.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://telasnegocio.stf.tu.aznxt.local/central-relacionamento-web/moldura/moldura.xhtml");
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
