package OO.polimorfismo;

public class Comida {

	/**
	 * Peso em kg
	 */
	private double peso = 0;

	public double getPeso() { // m�todo assessor get
		return peso;
	}

	public void setPeso(double peso) { // m�todo assessor set
		if (peso > 0) {
			this.peso = peso;
		}
	}
}
