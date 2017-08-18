package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>();
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for(/* Object substitu�do por */String nome: aprovados){
			System.out.println(nome);
					// HashSet: Jo�o Rafael Pedro Maria - sem ordem nenhuma
					// LinkedHashSet: Jo�o Pedro Maria Rafael - com ordem de inser��o
					// TreeSet: Jo�o Maria Pedro Rafael - com ordem alfab�tica

		}
	}
}
