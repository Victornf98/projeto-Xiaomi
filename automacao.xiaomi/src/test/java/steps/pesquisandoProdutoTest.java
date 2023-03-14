package steps;


import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class pesquisandoProdutoTest {
	
	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@When("escrever o nome do produto na barra de pesquisa")
	public void escreverONomeDoProdutoNaBarraDePesquisa() {
	    me.clicar(el.buscar);
	    me.escrever(el.texto,"carregador");
	}
	@When("apertar a lupa")
	public void apertarALupa() {
	    me.clicar(el.btnBuscar);
	}
	@Then("o sistema deve direcioná-lo para a pagina com a opcao do produto")
	public void oSistemaDeveDirecionáLoParaAPaginaComAOpcaoDoProduto() throws IOException {
	    me.validarTexto(el.validandoProduto, "Carregador Rápido Xiaomi 67W");
	    me.evidenciarTeste("Captura de tela3 - pesquisando produto");
	}
}


	


