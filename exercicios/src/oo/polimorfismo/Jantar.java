package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Comida igrediente1 = new Arroz(0.2);
		Comida igrediente2 = new Feijao(0.1);
		
		Comida igrediente3 = new Arroz(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(igrediente1);
		convidado.comer(igrediente2);
		convidado.comer(igrediente3);
		
		System.out.println(convidado.getPeso());
		
		Comida sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());

	}

}
