package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria"); // caso não consiga adicionar, o retorno é um boolean false
		fila.offer("João");
		fila.add("Pedro"); // caso não consiga adicionar, o retorno é um erro
		
		System.out.println("Peek/Element..."); // não removem elementos da lista, apenas os mostram
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Poll/Remove...");
		System.out.println(fila.poll()); // Mostra o registro "Maria" e remove
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Retorna null caso não haja nada na lista
		System.out.println(fila.remove()); // Retorna erro casa não haja nada na lista
	}
}
