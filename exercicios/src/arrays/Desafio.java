package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Quantas notas deseja informar? ");
		int n = leitor.nextInt();
		
		double[] notas = new double[n];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota número %d: ", (i+1));
			notas[i] = leitor.nextDouble();
		}
		
		System.out.println("Notas: " + Arrays.toString(notas));
		
		double media = 0;
		for(double nota: notas) {
			media += nota;
		}
		
		System.out.printf("\nMédia das notas: %.1f!", (media/notas.length));
		leitor.close();

	}

}
