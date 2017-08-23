package OO.encapsulamento.casa2;

import OO.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo = "Minha sogra fala demais!";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei ... " + euMesmo.segredo); // Variável private é de instância. Só pode ser acessada pela própria classe
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal); // Variável default pode ser acessada estando no mesmo pacote
		
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja); // Variável pública pode ser acessada por todos
		
//		Sogra sogrinha = new Sogra();
//		System.out.println(sogrinha.segredoDeFamilia); // Variável protected só consegue ser acessada se estiver no mesmo pacote ou se recebesse essa informação  por herança
	}
}
