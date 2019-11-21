package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class desafioWebSiteCarreiras {
	
	public WebDriver driver;
	Random gerador = new Random();
	
	public boolean validaPagina(WebDriver driver)throws InterruptedException {
		boolean validado = false;
		if (driver.getTitle().equals("Inmetrics")) {
			validado = true;
			System.out.println("Usuario na pagina correta");
		} else {
			System.out.println("Pagina incorreta");
		}
		return validado;
	
	}
	public void selecionaVaga(WebDriver driver)throws Exception{
		try {
			//driver.findElement(By.id("filter-type")).click();
			//List<WebElement> list =  driver.findElements(By.id("filter-type"));
			//list.get(gerador.nextInt()).click();
		} catch(Exception e){
			throw new Exception("Erro ao escolher uma vaga");
		}
	}
}
