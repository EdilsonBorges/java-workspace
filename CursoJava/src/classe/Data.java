package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {

	}

	Data(int d, float m, int a) {
		
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
