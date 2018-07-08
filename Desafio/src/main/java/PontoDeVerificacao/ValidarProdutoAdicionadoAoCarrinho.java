package PontoDeVerificacao;

import org.openqa.selenium.WebDriver;
import Utilitarios.Metodos;

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
			
		}
			
	}
}
