package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
	
// Contrutor com param�tro
		Produto p1 = new Produto("Notebook", 4356.89);
		
// Construtor padr�o
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
//		Produto.desconto = 0.50;   altera o desconto de todos os produtos
		
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.printf("M�dia do carrinho: R$%.2f", (precoFinal1 + precoFinal2) / 2);

		
	}


}
