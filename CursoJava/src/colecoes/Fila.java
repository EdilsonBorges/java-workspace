package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria"); // caso n�o consiga adicionar, o retorno � um boolean false
		fila.offer("Jo�o");
		fila.add("Pedro"); // caso n�o consiga adicionar, o retorno � um erro
		
		System.out.println("Peek...");
		System.out.println(fila.peek());
	}
}
