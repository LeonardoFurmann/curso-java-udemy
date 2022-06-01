package controle;

import java.util.Scanner;

public class ContinueRotulado {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);

	

	
//		externo : for (int i = 0; i < 3; i++) {
//			for (int j = 0; j <3; j++) {
//				
//				if( i == 1) {
//					continue externo;
//				}
//				
//				System.out.printf("[%d %d] ", i, j);	
//			}
//			System.out.println();
//		}
//		
//		System.out.println("fim");
		
		int num = leitor.nextInt();
	    
	    int result = 1;

	    while(num > 0){
	         result = result * num;
	        num--;
	    }
	    
	    leitor.close();
	}

}

