package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.Driver;

public class Metodos extends Driver {

	public void clicar (By elemento) {
		driver.findElement(elemento).click();
	}
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void pausa(int time) {
		try {
			Thread.sleep(time);
		}catch(InterruptedException e) {
			e.printStackTrace();	
		}	
	}
	public void evidenciarTeste(String nomeEvidencia) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}
	public void currentUrl (String urlDesejada) {
		assertEquals(urlDesejada, driver.getCurrentUrl());	
	}
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		System.out.println("O texto capturado " + textoCapturado);
		assertEquals(textoEsperado, textoCapturado);
	}
	public void scroll() {
		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,280)");
	}
	
	
}
	

