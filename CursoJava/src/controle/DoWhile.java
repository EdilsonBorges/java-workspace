package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		do {
			nota = scanner.nextDouble();
			if(nota <= 10 && nota >= 0){
				somaDasNotas += nota;
				numeroDeNotas++;
			}
		} while (nota != -1);
		scanner.close();
		System.out.printf("A média é %.2f", somaDasNotas / numeroDeNotas);		
	}
	do
            {
                Console.WriteLine("Dentro do loop");
            } while (false);
                decimal aumento = 250;
            do
                {
                Console.WriteLine("O valor atual do aumento é de: " + aumento);
                aumento += 50;
            } while (aumento < 500);
}
