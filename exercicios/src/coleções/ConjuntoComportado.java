package cole��es;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
			
//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();  // ordem de inser��o
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		listaAprovados.add("Jo�o");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
			
		Set<Integer> nums= new HashSet<>();
		nums.add(1);
		nums.add(5);
		nums.add(61);
		nums.add(8);
		
		for (int n : nums) {
			System.out.println(n);
		}
		

	}

}
