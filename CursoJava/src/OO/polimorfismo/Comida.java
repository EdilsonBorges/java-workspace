package OO.polimorfismo;

public class Comida {

	/**
	 * Peso em kg
	 */
	private double peso = 0;

	public double getPeso() { // método assessor get
		return peso;
	}

	public void setPeso(double peso) { // método assessor set
		if (peso > 0) {
			this.peso = peso;
		}
	}
}
