package classe;

public class Desafio {

	int a = 2;

	public static void main(String[] args) { // n�o � um m�todo de inst�ncia, mas um m�todo que pertence � classe (que vem antes da inst�ncia)
//		int a = new Desafio().a;
//		System.out.println(a);
		Desafio d = new Desafio(); // Solu��o apresentada
		System.out.println(d.a);
	}

	void teste() { // teste() � um m�todo de inst�ncia, por isso ele consegue acessar as vari�veis de inst�ncia
		System.out.println(a);
	}
}
