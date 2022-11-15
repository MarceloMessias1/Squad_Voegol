package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Elementos {

	public By login = By.xpath("//*[@id=\"header\"]/nav[1]/section[2]/div/div/div[2]/section/nav[2]/div/div[2]/div/a");
	public By email = By.id("input-email");
	public By senha = By.id("input-password");
	public By validarLogin = By.xpath("//*[@class='a-icon o-menu__title o-menu__title--light a-icon--bf-avatar-round o-menu__title--hidden']");
	


}

