package Task;


import org.openqa.selenium.WebDriver;


import PageObject.SignInPage;
import Utilitarios.Metodos;

public class PreencherFormulario{

	private WebDriver driver;
	private Metodos metodos;
	private SignInPage signIn;
	
	public PreencherFormulario(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);
		this.signIn = new SignInPage(driver);
	}
	
	public void criarConta(String email){
		metodos.inserirTexto(signIn.campoDeTextoEmail(), email);
		metodos.clickElement(signIn.createAnAccountBotao());
	}
	
	
	//YOUR PERSONAL INFORMATION
	public void inserirPrimeiroNome(String nome){
		metodos.inserirTexto(signIn.campoDeTextoPrimeiroNome(), nome);
	}
	
	public void inserirUltimoNome(String nome) {
		metodos.inserirTexto(signIn.campoDeTextoUltimoNome(), nome);
	}
	
	public void inserirSenha(String senha) {
		metodos.inserirTexto(signIn.campoDeTextoSenha(), senha);
	}
	
	public void preencherInformacoesPessoais(String primeiroNome, String ultimoNome, String senha) throws InterruptedException {
		Thread.sleep(3000);
		inserirPrimeiroNome(primeiroNome);
		inserirUltimoNome(ultimoNome);
		inserirSenha(senha);
	}
	
	
	//YOUR ADDRESS
	public void inserirEndereco(String endereco) {
		metodos.inserirTexto(signIn.campoDeTextoEndereco(), endereco);
	}
	
	public void inserirCidade(String cidade) {
		metodos.inserirTexto(signIn.campoDeTextoCidade(), cidade);
	}
	
	public void selecionaEstado(String estado){
		metodos.selecionarElementoByText(signIn.selecionaEstado(), estado);
	}
	
	public void inserirCep(String cep) {
		metodos.inserirTexto(signIn.campoDeTextoCep(), cep);
	}
	
	public void selecionarPais(String pais) {
		metodos.selecionarElementoByText(signIn.selecionaPais(), pais);
	}
	
	public void inserirTelefone(String telefone) {
		metodos.inserirTexto(signIn.campoDeTextoTelefone(), telefone);
	}
	
	public void inserirEnderecoAlternativo(String endereco) {
		metodos.inserirTexto( signIn.campoDeTextoEnderecoAlternativo(), endereco);
	}
	
	public void preencherEndereco(String endereco, String cidade, String estado, String cep, String pais, String telefone, String enderecoAlternativo){
		inserirEndereco(endereco);
		inserirCidade(cidade);
		selecionaEstado(estado);
		inserirCep(cep);
		selecionarPais(pais);
		inserirTelefone(telefone);
		inserirEnderecoAlternativo(enderecoAlternativo);
	}
	
	
	
	public void register(){
		metodos.clickElement(signIn.registerBotao());
	}
	
}
