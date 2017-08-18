package colecoes;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new LinkedHashSet<>();
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for(/* Object substitu�do por */String nome: aprovados){
			System.out.println(nome);
					// HashSet: Jo�o Rafael Pedro Maria - sem ordem nenhuma
					// LinkedHashSet: Jo�o Pedro Maria Rafael - com ordem de inser��o

		}
	}
}
