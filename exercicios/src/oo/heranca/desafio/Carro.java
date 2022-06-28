package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velAtual;
	int delta = 5;
	
	Carro(int velMaxima){
		VELOCIDADE_MAXIMA = velMaxima;
	}
	
	void Acelerar() {
	
		if(velAtual + delta > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		} else {
			velAtual += delta;
		}
	
	}
	
	boolean Frear() {
		
	if(velAtual >= 5) {
		velAtual -= 5;
		return true;
	} else {
		velAtual = 0;
		return false;
		}
	}
	
	String tosString() {
		return "Velocidade atual é " + velAtual + " km/h";
	}
}
