package lambdas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		DecimalFormat df = new DecimalFormat("0.00");     // arredondar
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		
		
		Function<Produto, Double> precoReal = prod -> (prod.preco * ( 1 - prod.desconto));
		
		UnaryOperator<Double> comImposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
//		Function<Double, String> arredondar = preco -> df.format(preco);
		
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
				
			
//		UnaryOperator<String> formatar = preco -> "R$"+ preco.replace('.', ',');
		
		Function<Double,String> formatar = preco -> ("R$"+ preco).replace('.', ',');
				
				
		String resultado = precoReal
				.andThen(comImposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é:" + resultado);
		
		
		
		

	}

}
