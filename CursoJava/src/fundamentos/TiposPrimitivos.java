package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipo primitivo booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b \n", bo1, bo2);

		// Tipo primitivo caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c \n", c1, c2, c3);
		
		// Tipos primitivos inteiros
		byte b = 127;
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_337_036_854_775_807L;
		System.out.printf("%d %d %d %d", b, s, i, l);
	}
}
