package action;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class desafioWebSiteAction {

	public WebDriver driver;

	public void acessarSite(WebDriver driver) {

	}

	public boolean validaPagina(WebDriver driver) throws InterruptedException {
		boolean validado = false;
		driver.manage().window().maximize();
		driver.get("https://www.inmetrics.com.br");
		if (driver.getTitle().contains("Home - Inmetrics")) {
			validado = true;
			System.out.println("Usuario na pagina correta");
		} else {
			System.out.println("Pagina incorreta");
		}
		return validado;
	}

	public void navegaPagina(WebDriver driver) throws Exception {
		try {

			driver.findElement(By.id("linkcarreiras")).click();
		} catch (Exception e) {
			throw new Exception("Erro ao navegar pela p�gina");
		}
	}

	public void acessaCarreiras(WebDriver driver) throws Exception {
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//*[contains(text(),'confira nossas vagas')]")).click();
		} catch (Exception e) {
			throw new Exception("Erro ao abrir a p�gina de carreiras");
		}

	}

}
