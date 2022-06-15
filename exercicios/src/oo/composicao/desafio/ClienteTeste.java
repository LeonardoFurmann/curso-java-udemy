package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Computador", 1500, 1);
		compra1.adicionarItem("Xicara", 15.90, 3);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Tapete", 55.55, 1);
		compra2.adicionarItem("Impressora", 400.35, 1);
		
		Cliente cliente1 = new Cliente("Leonardo");	
		cliente1.adiocionarCompra(compra1);
		cliente1.compras.add(compra2);
		
		
		System.out.println("Valor Total das compras: " + cliente1.obterValorTotal());
		
		
//		Item item1 = new Item(2);
//		Item item2 = new Item(3);
//		Item item3 = new Item(2);
//		
//		item1.produto = new Produto("Computador", 1500) ;
//		item2.produto = new Produto("Xicara", 15.90);
//		item3.produto = new Produto("Tapete", 50.55);
//		
		
		
	}

}
