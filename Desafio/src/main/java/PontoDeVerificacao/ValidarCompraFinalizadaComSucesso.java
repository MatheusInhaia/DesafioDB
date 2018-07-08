package PontoDeVerificacao;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Utilitarios.Metodos;
import Utilitarios.ObterRelatorio;
import Utilitarios.TirarFoto;

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
			ObterRelatorio.log(Status.PASS, "Compra finalizada com sucesso.", TirarFoto.capture(driver));
		}else {
			ObterRelatorio.log(Status.FAIL, "A compra não foi finalizada");
			metodos.getDriver().quit();
		}
	}
}
