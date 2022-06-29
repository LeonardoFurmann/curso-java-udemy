package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velAtual;
	protected int delta = 5;
	 
	protected Carro(int velMaxima){
		VELOCIDADE_MAXIMA = velMaxima;
	}
	
	public void Acelerar() {
	
		if(velAtual + delta > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		} else {
			velAtual += delta;
		}
	
	}
	
	public boolean Frear() {
		
	if(velAtual >= 5) {
		velAtual -= 5;
		return true;
	} else {
		velAtual = 0;
		return false;
		}
	}
	
	public String tosString() {
		return "Velocidade atual é " + velAtual + " km/h";
	}
}
