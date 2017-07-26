package fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args){
		// Ex1 - conversão explícita
		float f = (float) 0.1;
		System.out.println(f);
		
		// Ex2 - conversão explícita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// Ex3 - conversão implícita
		int i2 = 'a';
		System.out.println(i2);
	}
}
