package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		//Ler num2
		// + - * / %
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double num1 = leitor.nextDouble();
		
		System.out.print("\nDigite outro n�mero: ");
		double num2 = leitor.nextDouble();
		
		System.out.print("\nDigite a opera��o:  ");
		String op = leitor.next();
		
		System.out.print(op.equals("+") ? "\nSoma: = " + (num1 + num2) : "");
		System.out.print(op.equals("-") ? "\nSubtra��o: = " + (num1 - num2) : "");
		System.out.print(op.equals("*") ? "\nMultiplica��o: = " + (num1 * num2) : "");
		System.out.print(op.equals("/") ? "\nDivis�o: = " + (num1 / num2) : "");
		System.out.print(op.equals("%") ? "\nM�todo: = " + (num1 % num2) : "");
		
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
