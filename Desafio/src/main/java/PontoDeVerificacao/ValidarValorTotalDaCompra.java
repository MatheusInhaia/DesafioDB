package PontoDeVerificacao;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObject.ShippingPage;
import PageObject.WomenPage;
import Utilitarios.Metodos;
import Utilitarios.ObterRelatorio;

public class ValidarValorTotalDaCompra {

	
	private WebDriver driver;
	private WomenPage womenPage;
	private ShippingPage shippingPage;
	private Metodos metodos;
	
	public String valorTotalFinal;
	public static double auxiliarValorDaRoupa;
	public static double auxiliarValorDoFrete;
	public static double auxiliarValorTotal;
	
	public ValidarValorTotalDaCompra(WebDriver driver) {
		this.driver = driver;
		this.womenPage = new WomenPage(driver);
		this.shippingPage = new ShippingPage(driver);
		this.metodos = new Metodos(driver);	
	}
	
	public void pegarValorDaRoupa() {
		try {
		String valor = womenPage.valorDaBlouse().getText();
		if (!valor.isEmpty()) valor = valor.substring (1);
		auxiliarValorDaRoupa = Double.parseDouble(valor); 
		}catch(Exception e){
			
		}
	}
	
	public void pegarValorDoFrete() {
		String valor = shippingPage.valorDoFrete().getText();
		if (!valor.isEmpty()) valor = valor.substring (1);
		auxiliarValorDoFrete = Double.parseDouble(valor);
	}
	
	public void calcularValorTotal(){
		auxiliarValorTotal = auxiliarValorDaRoupa + auxiliarValorDoFrete;
		valorTotalFinal = "$" + Double.toString(auxiliarValorTotal);
		
		
	}
	public void validandoValorTotalDaCompra() {
		calcularValorTotal();
		if(metodos.possuiSequenciaDeCaracteres(valorTotalFinal)) {
			ObterRelatorio.log(Status.PASS, "O valor total está correto.");
		}else {
			ObterRelatorio.log(Status.FAIL, "O valor total está incorreto.");
			metodos.getDriver().quit();
		}
	}
	
	
}
