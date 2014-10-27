package findAWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		
		String line;
		String[] lineArray, encryptionKey;
		String encryptedText;

		StringBuilder output = new StringBuilder();

		while ((line = in.readLine()) != null) {
			output.setLength(0);
			line = line.trim();
			lineArray = line.split("[|]");

			encryptedText = lineArray[0];
			encryptionKey = lineArray[1].trim().split(" ");

			for (int i = 0; i < encryptionKey.length; i++) {
				int m = Integer.parseInt(encryptionKey[i]);
				output.append(encryptedText.charAt(m - 1));
			}
			System.out.println(output.toString());
		}
		in.close();
	}
}