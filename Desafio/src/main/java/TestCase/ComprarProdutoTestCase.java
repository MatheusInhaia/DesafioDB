package TestCase;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Task.EscolherProduto;
import Utilitarios.Metodos;


public class ComprarProdutoTestCase {

	public WebDriver driver;
	
	private Metodos metodos;
	private EscolherProduto escolherProduto;
	
	@Before
	public void setUp() {
		driver = Metodos.getChromeDriver();
		driver.manage().window().maximize();
		
		this.metodos = new Metodos(driver);
		this.escolherProduto = new EscolherProduto(driver);
		
		
		
	}
	
	@Test
	public void comprarProduto() throws InterruptedException {
		metodos.visita("http://automationpractice.com/");
		escolherProduto.escolhendoProduto();
	}
}
