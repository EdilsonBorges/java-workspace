package OO.encapsulamento.casa2;

import OO.encapsulamento.casa1.Sogra;
import OO.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {

	String segredoDoCasal = "Meu marido está quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem... " + euMesma.segredoDoCasal);
		
//		Genro meuAmor = new Genro();
//		System.out.println(meuAmor.segredo); // Atributo de genro é private, não pode ser acessado por ninguém além da própria classe
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
//		Sogra mamae = new Sogra();
//		System.out.println(mamae.segredoDeFamilia); // Atributo protected não consegue ser acessado, pois foi herdado para a própria classe
		
		System.out.println(euMesma.segredoDeFamilia);
	}
}
