package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho terca (V ou F)
		// Trabalho quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
	
		boolean tv50 = trabalho1 && trabalho2;
		System.out.println("Comprou a Tv de 50 polegadas: " + tv50);
		
		boolean tv32 = trabalho1 ^ trabalho1;
		System.out.println("Comprou a Tv de 32 polegadas: " + tv32);
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Comprou sorvete: : " + sorvete);
		
		boolean nada = !trabalho1 && !trabalho2;
		System.out.println("Mais saudável: : " + nada);
		
//		 terca e quinta V - tv 50
//		 terca xor quinta V - tv 32
//		 terca ou quinta V - sorvete
//		 terca e quinta F - nada

	}

}
