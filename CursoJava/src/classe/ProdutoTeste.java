package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.nome = "Notebook Acter 15' 8Gb";
		produto1.preco = 2300;
		produto1.desconto = 0.15;
		
		Produto produto2 = new Produto("Caneta BIC Preta", 2.83, 0.05);
		
		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
	}
}
