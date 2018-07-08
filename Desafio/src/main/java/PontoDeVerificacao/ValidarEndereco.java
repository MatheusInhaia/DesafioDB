package PontoDeVerificacao;

import org.openqa.selenium.WebDriver;

import PageObject.SummaryPage;
import Utilitarios.Metodos;

public class ValidarEndereco {
	

	public WebDriver driver;
	public Metodos metodos;
	public SummaryPage summaryPage;
	
	
	
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
			
		}
	}
	
}