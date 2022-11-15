package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexoes.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto, Keys.RETURN);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarLogin(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		// assertTrue(textoCapturado.contains(textoEsperado));
		assertEquals(textoEsperado, textoCapturado);
	}

	public void pausa(int tempo) {
		try {

			Thread.sleep(tempo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void esperarElemento(By elemento) {
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	public void waitUntil() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}

	public void salvarScreenShot(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./evidencias" + fileName + ".png"));

		try {

		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
