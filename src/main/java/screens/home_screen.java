package screens;



import java.net.MalformedURLException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.login_screen;

import cucumber.api.junit.Cucumber;
import devc.App;

public class home_screen {

	App	auxDriver = new App();
	WebDriver driver = auxDriver.conex();
	WebDriverWait espera = auxDriver.esperar(driver);
	
	
	public void realizarLogin() throws MalformedURLException{
		 

	
	WebElement menuHamburguer = driver.findElement(By.xpath("//android.widget.ImageButton[@bounds='[0,84][196,280]']"));


		menuHamburguer.click();
		espera.until(ExpectedConditions.elementToBeClickable((By.id("email"))));
		WebElement irTelaLogin = driver.findElement(By.id("email"));
		irTelaLogin.click();
		
	
		
		
		
	
	}
}
