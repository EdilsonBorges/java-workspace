package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data nascimento = new Data(); // cada instância é uma cópia independente
//		nascimento.dia = 19;
//		nascimento.mes = 11;
//		nascimento.ano = 1987;
		
		Data casamento = new Data(8, 9, 2010); // cada instância é uma cópia independente
		
		System.out.println(nascimento.formatar()); // this aqui será o nascimento
		System.out.println(casamento.formatar()); // this aqui será o casamento
	}
}
