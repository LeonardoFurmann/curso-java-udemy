package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		int quantidadeDeNotas = 0;
		double soma = 0;
		double nota = 0;
			
		
		while(nota != -1) {
			System.out.print("Digite a nota (ou -1 p/ sair): ");
			nota = leitor.nextDouble();
			
			if(nota >= 0 && nota <=10) {
				soma += nota;
				quantidadeDeNotas++;
			} else if(nota != -1){
				System.out.println("Nota inválida, digite novamente.");
			}
		}
		
		
		double media = soma/quantidadeDeNotas;
		System.out.println("Média das notas: " + media);
		leitor.close();
		
		
		
		
		
		

	}

}
