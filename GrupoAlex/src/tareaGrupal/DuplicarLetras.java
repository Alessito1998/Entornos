package trabajoGit;

public class DuplicarLetras {

	public static void main(String[] args) {
		String palabra = "NBA";
		System.out.println(repetirLetras(palabra));
	}

	public static String repetirLetras(String palabra) {
		StringBuilder cambiada = new StringBuilder();
		for (char c : palabra.toCharArray()) {
			cambiada.append(Character.toString(c).repeat(2));
		}
		return cambiada.toString();
	}
}
