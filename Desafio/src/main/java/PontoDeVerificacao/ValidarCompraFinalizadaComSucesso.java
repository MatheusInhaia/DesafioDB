package PontoDeVerificacao;

import org.openqa.selenium.WebDriver;
import Utilitarios.Metodos;

public class ValidarCompraFinalizadaComSucesso {

	private WebDriver driver;
	private Metodos metodos;
	
	private static final String mensagemDeSucesso  = "Your order on My Store is complete";
	
	
	public ValidarCompraFinalizadaComSucesso(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);
	}
	
	public void validandoCompraFinalizadaComSucesso() {
		if(metodos.possuiSequenciaDeCaracteres(mensagemDeSucesso)) {
			System.out.println("compra com sucesso");
		}else {
			System.out.println("Erro");
		}
	}
}
