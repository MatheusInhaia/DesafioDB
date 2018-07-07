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
	    escolherProduto.escolhendoProduto();
		preencherFormulario.criarConta("Matheus.teste.9@gmail.com");
		preencherFormulario.preencherInformacoesPessoais("Matheus", "Inhaia", "senha1");
		preencherFormulario.preencherEndereco("Rua 4, bairro Fiuza", "Porto Alegre", "01234", "85682323", "Rua 3, bairro Sitio São José");
		preencherFormulario.register();
		concluirCompra.concluiCompra();
	}
	
	
}
