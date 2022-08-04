package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Duster;
import oo.heranca.desafio.Sandero;

public class CarroTeste {

	public static void main(String[] args) {
		
		Duster duster = new Duster(); //os métodos chamados serão da instânica criada, do  tipo mais especifico ( Duster)
		duster.acelerar();
		duster.acelerar();
		
		System.out.println("Duster -  "+ duster.tosString());
		
		duster.acelerar();
		duster.frear();
		
		System.out.println("Duster -  "+ duster.tosString());
		
		duster.ligarTurbo();
		duster.acelerar();
		
		System.out.println("Duster -  "+ duster.tosString());
		
		duster.velDoAr();
		
		System.out.println(duster.velDoAr());
		
		System.out.println();
		
		Carro sandero = new Sandero();
		sandero.acelerar();
		
		System.out.println("Sandero - "+ sandero.tosString());
		
		sandero.acelerar();
		sandero.acelerar();
		sandero.frear();
		
		
		System.out.println("Sandero - "+ sandero.tosString());
		
		sandero.frear();
		sandero.frear();
		
		System.out.println("Sandero - "+ sandero.tosString());
		
		sandero.frear();
		System.out.println("Sandero - "+ sandero.tosString());
	}
		

}
