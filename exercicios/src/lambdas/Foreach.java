package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui", "Lia");
		
		System.out.println("Forma Tradicional");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01:");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));  // sem chaves, pois há apenas uma sentença de código
		
		System.out.println("\nMethod Reference #01:");
		aprovados.forEach(System.out::println);    // para cada aprovado, imprima.
		
		System.out.println("\nLambda #02:");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02:");
		aprovados.forEach(Foreach:: meuImprimir);    // Foreach -> nome da classe que possui a funçõa
	}
	
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
	

}
