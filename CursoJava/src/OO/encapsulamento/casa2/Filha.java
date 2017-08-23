package OO.encapsulamento.casa2;

import OO.encapsulamento.casa1.Sogra;
import OO.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {

	String segredoDoCasal = "Meu marido est� quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem... " + euMesma.segredoDoCasal);
		
//		Genro meuAmor = new Genro();
//		System.out.println(meuAmor.segredo); // Atributo de genro � private, n�o pode ser acessado por ningu�m al�m da pr�pria classe
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
//		Sogra mamae = new Sogra();
//		System.out.println(mamae.segredoDeFamilia); // Atributo protected n�o consegue ser acessado, pois foi herdado para a pr�pria classe
		
		System.out.println(euMesma.segredoDeFamilia);
	}
}
