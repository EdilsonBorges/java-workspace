package avancado;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(fatorialFor(3));
		System.out.println(fatorial(5));
	}

	public static int fatorialFor(int numero) {
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

	private static int fatorial(int numero) {
		if (numero <= 1) {
			return 1;
		}

		return numero * fatorial(numero - 1);
	}

//	Mais exemplos de recursividade: fractal
//	void fractal(int x, y, r) {
//		 if(r <= 0) { return; }
//		 fractal(x-r, y+r, r / 2);
//		 fractal (x+r, y+r, r / 2);
//		 fractal (x-r, y-r, r / 2);
//		 fractal (x+r, y-r, r / 2);
//		 quadrado(x, y, r);
//	}
	
}
