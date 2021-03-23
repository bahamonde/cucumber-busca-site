package io.cucumber.aline;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class BuscaNoSiteSteps {
    public BuscaNoSiteSteps(){

    }

    public WebDriver browser;

    @Quando("eu acesso o site torneseumprogramador")
    public void eu_acesso_o_site_torneseumprogramador() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        browser = new ChromeDriver();
	    browser.get("https://www.torneseumprogramador.com.br/");
    }

    @Quando("digito no campo de pesquisa {string}")
    public void digito_no_campo_pesquisa(String string) {
        WebElement input = browser.findElement( By.cssSelector("input[name='q']") );
        input.sendKeys(string);
    }


    @Quando("clico no botao da lupa")
	public void clico_no_botao_lupa() {
		WebElement button = browser.findElement( By.cssSelector(".btn-pesquisa") );
		button.click();
	}

    @Entao("devo ver a mensagem de sucesso {string}" )
    public void eu_devo_ver_a_url(String string) {
        WebElement message = browser.findElement( By.cssSelector(".div-col-h1") );
		assertEquals(string, message.getText());
		browser.quit();
    }

}
