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
		final Produto produto = new Produto("Caneta", 1); 	/* Definindo a variável "produto" como final, ou seja, a
															referência dessa variável não pode mudar durante a execução do programa.
															Isso não quer dizer que os atributos não possam ser alterados.
															*/
		Produto produto2 = produto; // Variável produto2 apontando para o mesmo objeto na memória
		produto2.nome = "Lapis"; // Essa atribuição de produto2 vai alterar o objeto produto, que também referenciado pela variável produto
	
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
		
		Produto produtoTeste = new Produto(); // Criando uma nova variável produto, sem utilizar "produto", já que este é do tipo "final"
		porReferencia(produtoTeste);
		System.out.println(produtoTeste.preco);
	}
}
