package trabajoGit;

public class RepetirStrings {

	public static void main(String[] args) {
		String palabra1 = "Mario";
		String palabra2 = "Gonzalez";
		int numVeces = 5;

		System.out.println(repetirPalabras(palabra1, palabra2, numVeces));
	}

	public static String repetirPalabras(String palabra1, String palabra2, int numVeces) {
		return palabra1.repeat(numVeces) + " " + palabra2.repeat(numVeces);
	}

}
