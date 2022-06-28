package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro duster = new Duster(); //os métodos chamados serão da instãnica criada, do  tipo mais especifico ( Duster)
		duster.Acelerar();
		duster.Acelerar();
		
		System.out.println("Duster -  "+ duster.tosString());
		
		duster.Acelerar();
		duster.Frear();
		
		Carro sandero = new Sandero();
		sandero.Acelerar();
		
		System.out.println("Sandero - "+ sandero.tosString());
		
		sandero.Acelerar();
		sandero.Acelerar();
		sandero.Frear();
		
		
		System.out.println("Duster -  "+ duster.tosString());
		System.out.println("Sandero - "+ sandero.tosString());
		
		sandero.Frear();
		sandero.Frear();
		
		System.out.println("Sandero - "+ sandero.tosString());
		
		sandero.Frear();
		
		System.out.println("Sandero - "+ sandero.tosString());
		
	}

}
