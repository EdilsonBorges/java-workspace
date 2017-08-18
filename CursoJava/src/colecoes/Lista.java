package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		System.out.println(aprovados.get(1)); // estrutura indexada, é possível acessar os registros pelo índice  
		
		System.out.println(aprovados.add("Maria")); // Mesmo conteúdo, mas registros diferentes
		System.out.println(aprovados.size()); // 5
		
		System.out.println(aprovados.remove("maria")); // false
		System.out.println(aprovados.remove("Maria")); // true, mas apenas 1 registro removido
		
		for(String nome: aprovados){
			System.out.println(nome);
		}
	}
}
