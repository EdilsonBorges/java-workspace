package colecoes;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new LinkedHashSet<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for(/* Object substituído por */String nome: aprovados){
			System.out.println(nome);
					// HashSet: João Rafael Pedro Maria - sem ordem nenhuma
					// LinkedHashSet: João Pedro Maria Rafael - com ordem de inserção

		}
	}
}
