package arrays;

import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for(double notaAlunoA : notasAlunoA) {
			totalAlunoA += notaAlunoA;
		}
			
		
		System.out.println(totalAlunoA/ notasAlunoA.length);
		
		double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.8, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
		for(double notaAlunoB : notasAlunoB) {
			totalAlunoB += notaAlunoB;
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}


