package controle;

import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;

		int indice = 0;
		while (indice < 3) {
			nota = scanner.nextDouble();
			somaDasNotas += nota;
			indice++;
		}
		
		scanner.close();
		System.out.printf("A média é %.2f", somaDasNotas / 3);
	}
	
	public class ExemploWhile {
        public static void main(String args[]) {
           int contador = 0;
         while (contador < 50) {
            System.out.println("Repetição nr: " + contador);
            contador++;
         }
       }
    }
}
