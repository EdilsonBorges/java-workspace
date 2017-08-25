package OO.polimorfismo;

public class Pessoa {
	/**
	 * Peso em kg
	 */
	private double peso = 0;

	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}

	public double getPeso() {
		return peso;
	}

	/*
	 * ### Polimorfismo est�tico / Sobrecarga de m�todo ###
	 */
	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}

	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}
	/*
	 * ####################################################
	 */
}
