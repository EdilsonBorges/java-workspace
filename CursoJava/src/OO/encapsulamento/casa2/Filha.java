package OO.encapsulamento.casa2;

import OO.encapsulamento.casa1.Sogra;

public class Filha extends Sogra {

	String segredoDoCasal = "Meu marido est� quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem... " + euMesma.segredoDoCasal);
	}
}
