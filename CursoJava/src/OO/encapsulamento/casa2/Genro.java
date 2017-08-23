package OO.encapsulamento.casa2;

public class Genro {

	private String segredo = "Minha sogra fala demais!";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei ... " + euMesmo.segredo); // Variável private é de instância. Só pode ser acessada pela própria classe
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal); // Variável default pode ser acessada estando no mesmo pacote
	}
}
