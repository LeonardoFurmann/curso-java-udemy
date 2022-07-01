package oo.heranca.desafio;

public interface Luxo {
	
	public abstract void ligarAr();
	void desligarAr();
	
	default int velDoAr() {
		return 1;
	}
}
