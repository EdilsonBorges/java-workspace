package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		System.out.println(aprovados.get(1)); // estrutura indexada, � poss�vel acessar os registros pelo �ndice  
		
		System.out.println(aprovados.add("Maria")); // Mesmo conte�do, mas registros diferentes
		System.out.println(aprovados.size()); // 5
		
		System.out.println(aprovados.remove("maria")); // false
		System.out.println(aprovados.remove("Maria")); // true, mas apenas 1 registro removido
		
		for(String nome: aprovados){
			System.out.println(nome);
		}
	}
}
