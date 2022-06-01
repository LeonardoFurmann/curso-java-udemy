package classe;

public class AreaCirc {
	
	double raio;
	static final double pi = 3.14; // pertence a classe
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return   pi * Math.pow(raio, 2);
	}
	
	static double area(double raio) {  // pertence a classe
		return   pi * Math.pow(raio, 2);
	}

}
