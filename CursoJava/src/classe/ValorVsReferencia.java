package classe;

public class ValorVsReferencia {

	// int a = 2;
	// int b = a; // passagem por valor
	// int c; // valor 0 na mem�ria
	//
	// Object a = new Object();
	// Object b = a; // passagem por refer�ncia
	// Object c; // null

	static void porValor(double numero) {
		numero++;
	}

	static void porReferencia(Produto produto) {
		produto.preco++;
	}

	public static void main(String[] args) {
		double numero = 1;
		final Produto produto = new Produto("Caneta", 1); 	/* Definindo a vari�vel "produto" como final, ou seja, a
															refer�ncia dessa vari�vel n�o pode mudar durante a execu��o do programa.
															Isso n�o quer dizer que os atributos n�o possam ser alterados.
															*/
		Produto produto2 = produto; // Vari�vel produto2 apontando para o mesmo objeto na mem�ria
		produto2.nome = "Lapis"; // Essa atribui��o de produto2 vai alterar o objeto produto, que tamb�m referenciado pela vari�vel produto
	
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
		
		Produto produtoTeste = new Produto(); // Criando uma nova vari�vel produto, sem utilizar "produto", j� que este � do tipo "final"
		porReferencia(produtoTeste);
		System.out.println(produtoTeste.preco);
	}
}
