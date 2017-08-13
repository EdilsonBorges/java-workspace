package classe;

public class ValorVsReferencia {

	// int a = 2;
	// int b = a; // passagem por valor
	// int c; // valor 0 na memória
	//
	// Object a = new Object();
	// Object b = a; // passagem por referência
	// Object c; // null

	static void porValor(double numero) {
		numero++;
	}

	static void porReferencia(Produto produto) {
		produto.preco++;
	}

	public static void main(String[] args) {
		double numero = 1;
		Produto produto = new Produto("Caneta", 1);
		Produto produto2 = produto; // Variável produto2 apontando para o mesmo objeto na memória
		produto2.nome = "Lapis"; // Essa atribuição de produto2 vai alterar o objeto produto, que também referenciado pela variável produto
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
	}
}
