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
		System.out.println("Size..." + conjunto.size()); // Size...6
		
		System.out.println("Remove..."); // Remove...
		System.out.println(conjunto.remove("a")); // false
		System.out.println(conjunto.remove('a')); // true
		System.out.println("Size..." + conjunto.size()); // Size...5
		
		System.out.println("Contains..."); // Contains...
		System.out.println(conjunto.contains('a')); // false
		System.out.println(conjunto.contains(1)); // true
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		conjunto.addAll(nums);
		System.out.println(conjunto); // [1, 2, 3, 3.14, false, 10, Texto]
		conjunto.retainAll(nums);
		System.out.println(conjunto); // [1, 2, 3]
		conjunto.clear();
		System.out.println(conjunto.isEmpty()); // true
		
	}
}
