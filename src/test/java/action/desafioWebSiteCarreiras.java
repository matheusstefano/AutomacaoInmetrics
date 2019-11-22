package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.ui.Size;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class desafioWebSiteCarreiras {

	public WebDriver driver;
	Random random = new Random();

	public boolean validaPagina(WebDriver driver) throws InterruptedException {
		boolean validado = false;
		if (driver.getTitle().equals("Inmetrics")) {
			validado = true;
			System.out.println("Usuario na pagina correta");
		} else {
			System.out.println("Pagina incorreta");
		}
		return validado;

	}

	public void selecionaVaga(WebDriver driver) throws Exception {
		try {

			Select lista = new Select(driver.findElement(By.id("filter-type")));
			lista.selectByIndex(random.nextInt(5));

		} catch (Exception e) {
			throw new Exception("Erro ao escolher uma vaga");
		}
	}

	public void selecionaLocal(WebDriver driver) throws Exception {
		try {

			Select listaLocal = new Select(driver.findElement(By.id("filter-workplace")));
			listaLocal.selectByIndex(random.nextInt(5));

		} catch (Exception e) {
			throw new Exception("Erro ao selecionar o local de Trabalho");
		}
	}

}
