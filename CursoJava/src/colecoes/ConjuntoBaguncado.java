package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add..."); // Add...
		System.out.println(conjunto.add(1)); // false
		System.out.println(conjunto.add(10)); // true
		System.out.println("Size..." + conjunto.size());
		
		System.out.println("Remove...");
		System.out.println(conjunto.remove("a"));
	}
}
