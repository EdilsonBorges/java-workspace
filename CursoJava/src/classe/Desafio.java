package classe;

public class Desafio {

	int a = 2;

	public static void main(String[] args) { // não é um método de instância, mas um método que pertence à classe (que vem antes da instância)
//		int a = new Desafio().a;
//		System.out.println(a);
		Desafio d = new Desafio(); // Solução apresentada
		System.out.println(d.a);
	}

	void teste() { // teste() é um método de instância, por isso ele consegue acessar as variáveis de instância
		System.out.println(a);
	}
}
