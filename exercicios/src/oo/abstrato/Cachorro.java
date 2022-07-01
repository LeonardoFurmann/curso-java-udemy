package oo.abstrato;

public class Cachorro extends Mamifero { // classe concreta
	
	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
}
