package TestCase;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import Task.ConcluirCompra;
import Task.EscolherProduto;
import Task.PreencherFormulario;
import Utilitarios.Metodos;


public class ComprarProdutoTestCase {

	public WebDriver driver;
	
	private Metodos metodos;
	private EscolherProduto escolherProduto;
	private PreencherFormulario preencherFormulario;
	private ConcluirCompra concluirCompra;
	
	
	@Before
	public void setUp() {
		driver = Metodos.getChromeDriver();
		driver.manage().window().maximize();
		
		this.metodos = new Metodos(driver);
		this.escolherProduto = new EscolherProduto(driver);
		this.preencherFormulario = new PreencherFormulario(driver);
		this.concluirCompra = new ConcluirCompra(driver);
	
		
	}
	
	@Test
	public void comprarProduto() throws InterruptedException  {
		metodos.visita("http://automationpractice.com/");
	    escolherProduto.escolhendoProduto("1 Product", "Blouse");
		preencherFormulario.criarConta("Matheus.teste.45@gmail.com");
		preencherFormulario.preencherInformacoesPessoais("Matheus", "Inhaia", "senha1");
	    preencherFormulario.preencherEndereco("Rua 4, bairro Fiuza", "Porto Alegre", "Florida", "01234", "United States", "85682323", "Rua 3, bairro Sitio São José");
		preencherFormulario.register();
		concluirCompra.concluiCompra("Rua 4, bairro Fiuza", "Porto Alegre", "Florida", "United States");
	}
	
	
}
