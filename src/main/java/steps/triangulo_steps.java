package steps;

import java.net.MalformedURLException;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import screens.triangulo_screen;

public class triangulo_steps {
	
	triangulo_screen t = new triangulo_screen();
	
	@Dado("^que estou no app do triangulo$")
	public void nada(){
		
	}
	
	    
	    


	@Quando("^eu preencher o campo Lado um com \"([^\"]*)\"$") 
	public void preencheLado1(String value) throws MalformedURLException{
		
		t.preencherLado1(value);
		
	}


	@Quando("^eu preencher o campo Lado dois com \"([^\"]*)\"$")
	public void preencheLado2(String value2) throws MalformedURLException{
		
		t.preencherLado2(value2);
	}
	
	

	@Quando("^eu preencher o campo Lado tres com \"([^\"]*)\"$")
public void preencheLado3(String value3) throws MalformedURLException{
		
		t.preencherLado3(value3);
	}
	

	@Quando("^eu clicar em Calcular$")
	public void btnCalcular(){
		
		t.clicarBotaoCalcular();
		
	}
	

	@Entao("^a mensagem \"([^\"]*)\" sera exibida$")
	
	public void mensagemFeliz(String msg){
		t.mensagemFeliz(msg);
		
	}
	   
	

}
