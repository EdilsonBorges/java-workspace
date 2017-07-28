package fundamentos;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		b += a;
		System.out.println(b); // 10
		b *= 4;
		System.out.println(b); // 40
		b /= 2;
		System.out.println(b); // 20
		b -= 2;
		System.out.println(b); // 18
		b %= 2;
		System.out.println(b); // 0
	}
}
