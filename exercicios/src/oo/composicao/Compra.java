package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	
	double obeterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
	
	// bidigecional	

//		void adicionarItem(Item item) {
//			this.itens.add(item);
//			item.compra = this;
//		}
}
