package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String coisa = "";
		
		while(!coisa.equalsIgnoreCase("sair")) {
			System.out.println("Digite alguma coisa: ");
			 coisa = leitor.nextLine();	 
	}
		System.out.println("Saiu!");
		
		leitor.close();
	
	}

}
