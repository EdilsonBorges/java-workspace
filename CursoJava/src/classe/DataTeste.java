package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data nascimento = new Data(); // cada inst�ncia � uma c�pia independente
//		nascimento.dia = 19;
//		nascimento.mes = 11;
//		nascimento.ano = 1987;
		
		Data casamento = new Data(8, 9, 2010); // cada inst�ncia � uma c�pia independente
		
		System.out.println(nascimento.formatar()); // this aqui ser� o nascimento
		System.out.println(casamento.formatar()); // this aqui ser� o casamento
	}
}
