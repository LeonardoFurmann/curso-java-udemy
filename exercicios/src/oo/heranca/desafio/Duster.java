package oo.heranca.desafio;

public class Duster extends Carro{
	
	public Duster(){
		this(315);
	}
	
	
	public Duster(int velMaxima){
		super(velMaxima);
		delta = 15;
	}
	
//	
//	@Override                
//	void Acelerar() {
//		velAtual += 15;
//}
	
	
}
