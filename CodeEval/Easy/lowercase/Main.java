package lowercase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		boolean gate = false;

		while ((line = in.readLine()) != null) {
			gate = false;
			String[] lineArray = line.split("(?!^)");
			for (int i = 0; i < lineArray.length; i++) {
				if (Character.isLetter(lineArray[i].charAt(0))) {
					if (gate) {
						System.out.print(lineArray[i].toLowerCase());
						gate = false;
					} else {
						System.out.print(lineArray[i].toUpperCase());
						gate = true;
					}
				} else {
				System.out.print(lineArray[i]);
				}
			}
			System.out.print("\n");
		}
		in.close();
	}
}