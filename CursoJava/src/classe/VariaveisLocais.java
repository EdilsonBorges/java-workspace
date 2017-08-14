package classe;

public class VariaveisLocais {

	int a = 2; // visível dentro da instância
	int a1 = 2;
	
	void teste1() {
		int a1 = 2;
		System.out.println(a);
		System.out.println(a1);
		if(a1 > 3){
			int a2 = 3;
		}
		// System.out.println(a2); // variável a2 visível apenas para o escopo do if()
	}
	
	void teste2() {
		int a1 = 7;
		System.out.println(a1);
		System.out.println(this.a1);
	}
}
