package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
			//�F - 32) x 5/9 = �C
		
		final double ajuste = 32;
		final double fator = 5/9.0;
		double f = 86;
		double c = (f-ajuste) * fator;
		
		System.out.println("Temperatura em Celsius: " + c + "�C.");
		
		}
}
