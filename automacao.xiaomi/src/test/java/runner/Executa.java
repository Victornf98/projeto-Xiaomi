package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", 
		glue = "steps", 
		tags = "@all", 
		monochrome = true, 
		dryRun = false, 
		plugin = {"pretty", "html:target/cucumber-report.html" }, 
		snippets = SnippetType.CAMELCASE)

public class Executa extends Driver {

	@BeforeClass
	public static void abrirNavegador() {
		String url = "https://xiaomibrasil.com.br/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void fecharNavegador() {
		driver.quit();
	}
}
