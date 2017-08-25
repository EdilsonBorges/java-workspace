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
	
	public void comer(Arroz arroz){
		this.peso += arroz.getPeso();
	}
}
