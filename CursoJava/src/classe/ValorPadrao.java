package classe;

public class ValorPadrao {

	static boolean a; // valor padrão false
	static int b; // valor padrão 0
	static Object c;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		
		int c = 0; // variável local deve ser criada de forma explícita
		// boolean c = false;
		// Object c = null;
		System.out.println(c);
	}
}
