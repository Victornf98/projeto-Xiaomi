package elementos;

import org.openqa.selenium.By;

public class Elementos {
    public By minhaConta = By.xpath("//a[@href=\"https://xiaomibrasil.com.br/minha-conta/\"]");
	public By email = By.id("user_login");
	public By senha = By.id("user_pass");
	public By btnLogin = By.id("wp-submit");
	public By validacaoText = By.cssSelector("div [class='jet-login-message']");
	
	public By buscar = By.xpath("//*[@id=\"page\"]/div[1]/section[4]/div[2]/div[3]/div/div/div/div");
	public By texto = By.xpath("//input [@class='jet-search__field']");
	public By btnBuscar = By.xpath("//button [@class='jet-search__submit']");
	public By validandoProduto = By.xpath("//div[@data-url='https://xiaomibrasil.com.br/produto/carregador-rapido-xiaomi-67w/']");
	
	public By fonesDeOuvido = By.xpath("//*[@id=\"menu-1-490cd2c\"]/li[3]/a");
	public By foneEscolhido = By.xpath("//*[@id=\"list-grid\"]/div/div/div/div[2]/div/div[1]/a/img");
    public By adicionarCarrinho = By.xpath("//button[@class='single_add_to_cart_button button alt wp-element-button']");
	public By validandoTextoCarrinho = By.xpath("//a[text()='Ver carrinho']");
	
}
