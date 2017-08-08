package controle;

public class SwitchComBreak {

	public static void main(String[] args) {
		String conceito = "";
		String nota = "4.6"; // double n�o � permitido para switch, necess�rio ser int, string ou enum

		switch (nota) {
		case "10":
		case "9":
			conceito = "A";
			break;
		case "8":
		case "7":
			conceito = "B";
			break;
		case "6":
		case "5":
			conceito = "C";
			break;
		case "4":
		case "3":
			conceito = "D";
			break;
		case "2":
		case "1":
		case "0":
			conceito = "E";
			break;
		default:
			conceito = null;
			break;
		}
		if (conceito != null) {
			System.out.println("Conceito " + conceito);
		} else {
			System.out.println("Nota inv�lida.");
		}
	}
}
