package steps;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.home_screen;
import screens.login_screen;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.junit.Cucumber;


public class login {
	
	
	@Dado("^que estou logado$") 
	   
	public void irLogin() throws MalformedURLException{
		 
		home_screen home = new home_screen();
		home.realizarLogin();
		login_screen lg = new login_screen();
		lg.inputarLogin();
		
		
	}


@Entao("^devo estar logado$")

public void validaLogin() throws MalformedURLException{
	 
	
	
}











	
	/* NETSHOES APP
	String textoInicio = driver.findElement(By.id("generic_dialog_positive")).getText();
	
	 boolean botaoOk = driver.findElement(By.id("generic_dialog_positive")).isEnabled();
	
	if(textoInicio.equalsIgnoreCase("LEGAL, ENTENDI")){
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("generic_dialog_positive"))));
		driver.findElement(By.id("generic_dialog_positive")).click();
	}
	
	
	
	@Dado("^que estou logado$") 
   
	public void irLogin() throws MalformedURLException{
		 
		Home_screen home = new Home_screen();
		home.realizarLogin();
		
	}


@Entao("^devo estar logado$")

public void validaLogin() throws MalformedURLException{
	 
	
	
}
	
	
	*/
	
	
	
	

}
