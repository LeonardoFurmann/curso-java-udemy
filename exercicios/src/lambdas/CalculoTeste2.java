package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> { return x + y; };		
		System.out.println(calculo.executar(2, 3));
		
		calculo = (x,y) -> x * y;   // sem chaves, o unico codigo ira retornar implicidamente
		System.out.println(calculo.executar(2, 3));
	}

}
