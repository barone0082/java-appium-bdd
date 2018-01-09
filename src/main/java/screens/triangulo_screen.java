package screens;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import devc.App;




public class triangulo_screen  {
	
	App auxDriver = new App();
	WebDriver driver = auxDriver.conex();
	
	WebDriverWait espera = auxDriver.esperar(driver);
	
	
public void preencherLado1(String v){
		
	
	
	WebElement campo1 = driver.findElement(By.id("txtLado1"));
	campo1.sendKeys(v);

	}

public void preencherLado2(String v) {
	
	
	
	WebElement campo2 = driver.findElement(By.id("txtLado2"));
	
	campo2.sendKeys(v);
	
}

public void preencherLado3(String v) {
	
	
	
	WebElement campo3 = driver.findElement(By.id("txtLado3"));

	campo3.sendKeys(v);
	
}


public void clicarBotaoCalcular(){
	
	WebElement botaoCalcular = driver.findElement(By.id("btnCalcular"));
	
	botaoCalcular.click();
	
	
}

public void mensagemFeliz(String msg){

	WebElement resposta = driver.findElement(By.id("txtResultado"));
	System.out.println(resposta.getText());
	//espera.until(ExpectedConditions.textToBePresentInElement(resposta,msg));
	
	String textoResposta = driver.findElement(By.id("txtResultado")).getText();
	System.out.println(textoResposta);
	assertEquals(msg,textoResposta);
}

}
