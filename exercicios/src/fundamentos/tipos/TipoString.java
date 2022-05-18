package fundamentos.tipos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa Tarde";
		
		System.out.println(s.concat("!!!"));
		
		System.out.println(s.startsWith("Boa"));
		
		System.out.println(s.endsWith("Dia"));
		
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		System.out.println(s.length());
		
		System.out.println(s.equals("boa tarde"));
		
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
				
		System.out.printf("Nome: %s %s", nome, sobrenome);
		
		String frase = String.format("Nome: %s %s", nome, sobrenome);
		System.out.println(frase);
	}
}
