package OO.encapsulamento.casa2;

public class Genro {

	private String segredo = "Minha sogra fala demais!";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei ... " + euMesmo.segredo); // Vari�vel private � de inst�ncia. S� pode ser acessada pela pr�pria classe
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal); // Vari�vel default pode ser acessada estando no mesmo pacote
	}
}
