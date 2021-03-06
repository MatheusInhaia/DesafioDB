package PontoDeVerificacao;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Utilitarios.Metodos;
import Utilitarios.ObterRelatorio;

public class ValidarEndereco {
	

	private WebDriver driver;
	private Metodos metodos;
	
	
	public ValidarEndereco(WebDriver driver){
		this.driver = driver;
		this.metodos = new Metodos(driver);
		
	}
	
	public boolean checandoEdereco(String endereco) {
		return metodos.possuiSequenciaDeCaracteres(endereco);
	}
	
	public boolean checandoCidade(String cidade) {
		return metodos.possuiSequenciaDeCaracteres(cidade);
	}
	
	public boolean checandoEstado(String estado) {
		return metodos.possuiSequenciaDeCaracteres(estado);
	}
	
	public boolean checandoPais(String pais) {
		return metodos.possuiSequenciaDeCaracteres(pais);
	}
	
	public void validandoEndereco(String endereco, String cidade, String estado, String pais) {
		if(checandoEdereco(endereco) && checandoCidade(cidade) && checandoEstado(estado) && checandoPais(pais)) {
			ObterRelatorio.log(Status.PASS, "O endereço está correto.");
		}else {
			ObterRelatorio.log(Status.FAIL, "O endereço está incorreto.");
			metodos.getDriver().quit();
		}
	}
	
}
