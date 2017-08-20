package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria"); // caso n�o consiga adicionar, o retorno � um boolean false
		fila.offer("Jo�o");
		fila.add("Pedro"); // caso n�o consiga adicionar, o retorno � um erro
		
		System.out.println("Peek/Element..."); // n�o removem elementos da lista, apenas os mostram
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Poll/Remove...");
		System.out.println(fila.poll()); // Mostra o registro "Maria" e remove
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Retorna null caso n�o haja nada na lista
		System.out.println(fila.remove()); // Retorna erro casa n�o haja nada na lista
	}
}
