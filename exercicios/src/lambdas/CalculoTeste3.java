package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// NÃO: int -> Double
		// SIM: double -> Double
        // Double a = 1.0;
		
		BinaryOperator<Double> calculo = (x, y) -> { return x + y; };		
		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo = (x,y) -> x * y;   // sem chaves, o unico codigo ira retornar implicidamente
		System.out.println(calculo.apply(2.0, 3.0));
		
		
		
		BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; };		
		System.out.println(calculo2.apply(2, 3));
		
		calculo = (x,y) -> x * y;   // sem chaves, o unico codigo ira retornar implicidamente
		System.out.println(calculo2.apply(2, 3));

		
		
	}

}
