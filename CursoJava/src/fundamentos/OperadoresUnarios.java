package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		// Incremento e decremento
		num1++;
		System.out.println(num1);							// 2
		--num1;
		System.out.println(num1);							// 1
		
		System.out.println(++num1 == num2--);				// true
		System.out.println(num1 == num2);					// false
		
		// Complemento binário
		System.out.println(Integer.toBinaryString(50)); 	// 110010
		System.out.println(Integer.toBinaryString(~50)); 	// 11111111111111111111111111001101
	}
}
