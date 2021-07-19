package frontatendimento.runner;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/validarCategoriasTratativas.feature",
		glue = { "com.squadwde.next.steps"},
		tags = { "@BackOffice" },
		monochrome = true,
		dryRun = false,
		strict= true)
public class Runner {
	
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
		//driver.navigate().to("http://automationpractice.com/index.php");
		driver.navigate().to("http://localhost:4200/webpack-dev-server/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
