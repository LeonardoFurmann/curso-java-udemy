package cole��es;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagun�ado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
			
		conjunto.add(1.2);      // double -> Double
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add("teste");
		conjunto.add(20);
		
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.contains(20));
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(20);
		
		System.out.println(nums);
		
		
//		conjunto.addAll(nums);			//Uni�o entre 2 conjuntos
		conjunto.retainAll(nums);		//Interse��o
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
