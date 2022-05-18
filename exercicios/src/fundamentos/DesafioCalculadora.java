package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		//Ler num2
		// + - * / %
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num1 = leitor.nextDouble();
		
		System.out.print("\nDigite outro número: ");
		double num2 = leitor.nextDouble();
		
		System.out.print("\nDigite a operação:  ");
		String op = leitor.next();
		
		System.out.print(op.equals("+") ? "\nSoma: = " + (num1 + num2) : "");
		System.out.print(op.equals("-") ? "\nSubtração: = " + (num1 - num2) : "");
		System.out.print(op.equals("*") ? "\nMultiplicação: = " + (num1 * num2) : "");
		System.out.print(op.equals("/") ? "\nDivisão: = " + (num1 / num2) : "");
		System.out.print(op.equals("%") ? "\nMétodo: = " + (num1 % num2) : "");
		
//		 Outra forma
//		
//		double resultado = "+".equals(op) ? num1 + num2 : 0;
//		resultado = "-".equals(op) ? num1 - num2 : resultado;
//		resultado = "*".equals(op) ? num1 * num2 : resultado;
//		resultado = "/".equals(op) ? num1 / num2 : resultado;
//		resultado = "%".equals(op) ? num1 % num2 : resultado;
//		
//		System.out.printf("%.2f %s %.2f = %.2f", num1, op , num2, resultado );
//		
		leitor.close();
	}

}
