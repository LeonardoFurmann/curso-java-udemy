package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	double Comer(Comida comida){
		
		this.peso += comida.peso;
		return this.peso;
	}
	
	String apresentar() {
		return String.format("Olá eu sou %s e tenho %.2f Kgs.", this.nome, this.peso);
	}
	
}
	