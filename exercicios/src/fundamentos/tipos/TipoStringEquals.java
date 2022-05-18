package fundamentos.tipos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // compara os conteudos
		
		Scanner leitor = new Scanner(System.in);
		
		
		String s2 = leitor.nextLine();
		System.out.println("2".equals(s2.trim())); // trim tira os espaços em branco
		
		leitor.close();
	}

}
