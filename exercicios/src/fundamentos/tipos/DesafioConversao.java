package fundamentos.tipos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String sal1= leitor.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salário: ");
		String sal2 = leitor.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salário: ");
		String sal3 = leitor.nextLine().replace(",", ".");;
		

		double valor1 = Double.parseDouble(sal1);
		double valor2 = Double.parseDouble(sal2);
		double valor3 = Double.parseDouble(sal3);
		
		double soma = valor1 + valor2 + valor3;
		
		System.out.println("Média dos sálarios: " + soma/3);
		
		leitor.close();
	}

}
