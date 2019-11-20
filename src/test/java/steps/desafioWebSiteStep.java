package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class desafioWebSiteStep {
	
    private WebDriver driver;

    @Before
    public void setUp(){

        // Abrindo o navegador Google Chrome
        System.setProperty("webdriver.chrome.driver", "/AutomacaoInmetrics/src/main/java/util/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 
        driver.get("https://www.inmetrics.com.br/");

    }
	@Dado("^que o usuario esteja no site da inmetrics$")
	public void que_o_usuario_esteja_no_site_da_inmetrics() throws Throwable {

	}

	@Quando("^o usuario navegar pela pagina$")
	public void o_usuario_navegar_pela_pagina() throws Throwable {

	}

	@Quando("^clicar no botao confira nossas vagas$")
	public void clicar_no_botao_confira_nossas_vagas() throws Throwable {

	}

	@Entao("^ira apresentar as vagas disponiveis$")
	public void ira_apresentar_as_vagas_disponiveis() throws Throwable {

	}

}
