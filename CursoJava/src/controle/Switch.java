package controle;

public class Switch {

	public static void main(String[] args) {
		String faixa = "amarela";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei fazer o 1");
		case "marrom":
			System.out.println("Sei fazer o 2");
		case "roxa":
			System.out.println("Sei fazer o 3");
		case "verde":
			System.out.println("Sei fazer o 4");
		case "laranja":
			System.out.println("Sei fazer o 5");
		case "vermelha":
			System.out.println("Sei fazer o 6");
		case "amarela":
			System.out.println("Sei fazer o 7");
		}
	}
}
