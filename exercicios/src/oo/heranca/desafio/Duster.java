package oo.heranca.desafio;

public class Duster extends Carro{
	
	Duster(){
		this(315);
	}
	
	
	Duster(int velMaxima){
		super(velMaxima);
		delta = 350;
	}
	
//	
//	@Override                
//	void Acelerar() {
//		velAtual += 15;
//}
	
	
}
