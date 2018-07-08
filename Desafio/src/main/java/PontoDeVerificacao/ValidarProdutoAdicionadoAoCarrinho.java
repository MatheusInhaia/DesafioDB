package PontoDeVerificacao;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Utilitarios.Metodos;
import Utilitarios.ObterRelatorio;
import Utilitarios.TirarFoto;

public class ValidarProdutoAdicionadoAoCarrinho {

	
	private WebDriver driver;
	private Metodos metodos;
	
	
	
	public ValidarProdutoAdicionadoAoCarrinho(WebDriver driver){
		this.driver = driver;
		this.metodos = new Metodos(driver);	
	}
	
	public boolean checandoQuantidade(String quantidade) {
		return metodos.possuiSequenciaDeCaracteres(quantidade);	
	}
	
	public boolean checandoNomeDoProduto(String nomeProduto) {
		return metodos.possuiSequenciaDeCaracteres(nomeProduto);
	}
	
	public void validandoProduto(String quantidade, String nomeProduto) {
		if(checandoQuantidade(quantidade) && checandoNomeDoProduto(nomeProduto)) {
			ObterRelatorio.log(Status.PASS, "O produto adicionado ao carrinho está correto.", TirarFoto.capture(driver));
		}else{
			ObterRelatorio.log(Status.FAIL, "O produto está incorreto.");
			metodos.getDriver().quit();
		}	
	}
}
