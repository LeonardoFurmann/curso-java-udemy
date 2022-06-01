package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida();
		c1.nome = "Feijão";
		c1.peso = 0.200;
		
		Comida c2 = new Comida();
		c2.nome = "Arroz";
		c2.peso = 0.120;
		
		Pessoa p1 = new Pessoa();
			p1.nome = "Leonardo";
			p1.peso = 65;
	
	
	System.out.println(p1.apresentar());
	
		p1.Comer(c1);
		p1.Comer(c2);
		System.out.println(p1.apresentar());

		

	}
}
