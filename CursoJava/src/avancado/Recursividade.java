package avancado;

public class Recursividade {

	public static void main(String[] args) {

	}

	public static int fatorialFor(int numero) {
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}
}
