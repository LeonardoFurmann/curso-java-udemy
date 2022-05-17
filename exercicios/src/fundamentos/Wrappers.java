package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;
		
//		Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());

		Character c = '#';
		System.out.println(c + "...");
		
		entrada.close();
	}

}
