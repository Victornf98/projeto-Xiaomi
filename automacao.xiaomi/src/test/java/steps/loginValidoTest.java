package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class loginValidoTest {

	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@When("preencher os campos de email ou usuario e senha")
	public void preencherOsCamposDeEmailOuUsuarioESenha() {
		me.clicar(el.minhaConta);
		me.escrever(el.email, "victor@tecnologia.com.br");
		me.escrever(el.senha, "cypress1998");
	}
	@When("pressionar o botao login")
	public void pressionarOBotaoLogin() {
		me.clicar(el.btnLogin);
	}
	@Then("valido a funcionalidade")
	public void validoAFuncionalidade() throws IOException {
		me.evidenciarTeste("Captura de tela2 - login valido");
	}

}
