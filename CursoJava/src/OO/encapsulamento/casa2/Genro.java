package OO.encapsulamento.casa2;

import OO.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo = "Minha sogra fala demais!";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei ... " + euMesmo.segredo); // Vari�vel private � de inst�ncia. S� pode ser acessada pela pr�pria classe
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal); // Vari�vel default pode ser acessada estando no mesmo pacote
		
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja); // Vari�vel p�blica pode ser acessada por todos
		
//		Sogra sogrinha = new Sogra();
//		System.out.println(sogrinha.segredoDeFamilia); // Vari�vel protected s� consegue ser acessada se estiver no mesmo pacote ou se recebesse essa informa��o  por heran�a
	}
}
