package cole��es;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
	// Offer e Add -> adicionam elementos na fila
		
	// Diferen�a � o comportamento quando a fila est� cheia
		fila.add("Ana"); 	// Retorna false
		fila.offer("Bia");  // Lan�a uma exce��o
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Carlos");
		
	//Peak e Element -> obter o pr�ximo  da fila sem remover
		
	// Diferen�a � o comportamento quando a fila est� vazia
		System.out.println(fila.peek());		// retorna false
		System.out.println(fila.element());		// lan�a uma exce��o
		
		
	//Pool e Remove -> obter o pr�ximo  da fila e remove
		
	// Diferen�a � o comportamento quando a fila est� vazia
		System.out.println(fila.poll()); 	// retorna false
		System.out.println(fila.remove());	//lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(...);
		
	}	

}
