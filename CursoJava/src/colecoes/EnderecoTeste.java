package colecoes;

public class EnderecoTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		System.out.println(endereco1 == endereco2); // false, compara��o de endere�o de mem�ria
		// System.out.println(endereco1.equals(endereco2)); // false, est� usando o m�todo equal da classe Object
		System.out.println(endereco1.equals(endereco2)); // true, pois agora eest� usando o m�todo equal da classe Endereco
	}
}
