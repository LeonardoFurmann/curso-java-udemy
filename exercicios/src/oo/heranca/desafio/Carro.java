package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velAtual;
	private int delta = 5;
	 
	protected Carro(int velMaxima){
		VELOCIDADE_MAXIMA = velMaxima;
	}
	
	public void acelerar() {
	
		if(velAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		} else {
			velAtual += getDelta();
		}
	
	}
	
	public boolean frear() {
		
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

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
