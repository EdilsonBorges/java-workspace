package classe;

public class ValorPadrao {

	static boolean a; // valor padr�o false
	static int b; // valor padr�o 0
	static Object c;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		
		int c = 0; // vari�vel local deve ser criada de forma expl�cita
		// boolean c = false;
		// Object c = null;
		System.out.println(c);
	}
}
