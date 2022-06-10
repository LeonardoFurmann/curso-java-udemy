package coleções;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome);
		
		System.out.println(">>>>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Bia")));
		
		for (Usuario u : lista) {
			System.out.println(u.toString());
		}
	}

}
