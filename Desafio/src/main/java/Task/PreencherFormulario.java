package Task;


import org.openqa.selenium.WebDriver;


import PageObject.SignInPage;
import Utilitarios.Metodos;

public class PreencherFormulario extends Metodos {

	private SignInPage signIn;
	
	public PreencherFormulario(WebDriver driver) {
		super(driver);
		this.signIn = new SignInPage(driver);
	}
	
	public void criarConta(String email){
		inserirTexto(signIn.campoDeTextoEmail(), email);
		clickElement(signIn.createAnAccountBotao());
	}
	
	
	//YOUR PERSONAL INFORMATION
	public void inserirPrimeiroNome(String nome){
		inserirTexto(signIn.campoDeTextoPrimeiroNome(), nome);
	}
	
	public void inserirUltimoNome(String nome) {
		inserirTexto(signIn.campoDeTextoUltimoNome(), nome);
	}
	
	public void inserirSenha(String senha) {
		inserirTexto(signIn.campoDeTextoSenha(), senha);
	}
	
	public void preencherInformacoesPessoais(String primeiroNome, String ultimoNome, String senha) throws InterruptedException {
		Thread.sleep(3000);
		inserirPrimeiroNome(primeiroNome);
		inserirUltimoNome(ultimoNome);
		inserirSenha(senha);
	}
	
	
	//YOUR ADDRESS
	public void inserirEndereco(String endereco) {
		inserirTexto(signIn.campoDeTextoEndereco(), endereco);
	}
	
	public void inserirCidade(String cidade) {
		inserirTexto(signIn.campoDeTextoCidade(), cidade);
	}
	
	public void selecionaEstado(String estado){
		selecionarElementoByText(signIn.selecionaEstado(), estado);
	}
	
	public void inserirCep(String cep) {
		inserirTexto(signIn.campoDeTextoCep(), cep);
	}
	
	public void selecionarPais(String pais) {
		selecionarElementoByText(signIn.selecionaPais(), pais);
	}
	
	public void inserirTelefone(String telefone) {
		inserirTexto(signIn.campoDeTextoTelefone(), telefone);
	}
	
	public void inserirEnderecoAlternativo(String endereco) {
		inserirTexto( signIn.campoDeTextoEnderecoAlternativo(), endereco);
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
		clickElement(signIn.registerBotao());
	}
	
}
