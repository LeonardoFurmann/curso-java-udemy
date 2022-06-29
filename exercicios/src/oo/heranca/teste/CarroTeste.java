package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Duster;
import oo.heranca.desafio.Sandero;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro duster = new Duster(); //os m�todos chamados ser�o da inst�nica criada, do  tipo mais especifico ( Duster)
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
