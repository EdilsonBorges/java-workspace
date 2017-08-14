package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		this(1, 1, 2017); // representa um dos construtores da sua própria classe
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
