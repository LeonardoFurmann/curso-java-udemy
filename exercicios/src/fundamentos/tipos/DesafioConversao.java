package fundamentos.tipos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro sal�rio: ");
		String sal1= leitor.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo sal�rio: ");
		String sal2 = leitor.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro sal�rio: ");
		String sal3 = leitor.nextLine().replace(",", ".");;
		

		double valor1 = Double.parseDouble(sal1);
		double valor2 = Double.parseDouble(sal2);
		double valor3 = Double.parseDouble(sal3);
		
		double soma = valor1 + valor2 + valor3;
		
		System.out.println("M�dia dos s�larios: " + soma/3);
		
		leitor.close();
	}

}
