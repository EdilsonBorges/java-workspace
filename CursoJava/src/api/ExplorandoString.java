package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = new String("Leonardo");
		nome = "Leo" + "nardo";
		
		// Alguns métodos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('d'));
		System.out.println(nome.charAt(6));
		System.out.println(nome.equalsIgnoreCase("leonardo"));
	}
}
