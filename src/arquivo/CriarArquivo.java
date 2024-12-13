package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivo {

	static Arquivo skibidi = new Arquivo("Skibidi.txt", "Nasser, o melho Lúcio do mundo e do Brasil");

	public static void main(String[] args) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(skibidi.getNome()))) {
			writer.write(skibidi.getConteudo());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}