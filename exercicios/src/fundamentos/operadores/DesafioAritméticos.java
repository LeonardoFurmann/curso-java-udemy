package fundamentos.operadores;

public class DesafioAritméticos {

	public static void main(String[] args) {
		
		// Resolução
		int a = 6 * (3 + 2);
		int a2 = (int) Math.pow(a, 2);
		
		int b = 3 * 2;
		
		int ab = a2 / b;
		
		int c = (1-5) * (2-7);
		
		int d = c/2;
		
		int cd = (int) Math.pow(d, 2);
		
		
		int e = ab - cd;
		int e2 = (int) Math.pow(e, 3);
		
		int f = (int) Math.pow(10, 3);
		
		int r = e2/f;
		
		System.out.println(r);
		
		// Resposta
		double numA = Math.pow(6 * (3+2), 2);
		double denA = 3*2;
		
		double numB = (1-5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior/ inferior;
		
		System.out.println(resultado);
		
	}

}
