package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String x = "Bom dia X".replace("X", "Leo");
		System.out.println(x);
	}
}
