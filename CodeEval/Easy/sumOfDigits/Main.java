package sumOfDigits;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int lineSum;
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split("(?!^)");
			lineSum = 0;
			for (int i = 0; i < line.length(); i++) {
				lineSum = lineSum + Integer.parseInt(lineArray[i]);
			}
			System.out.println(lineSum);
		}
		in.close();
	}
}