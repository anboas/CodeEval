package primePalindrome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		StringBuilder output = new StringBuilder();

		while ((line = in.readLine()) != null) {
			output.setLength(0);
			output.append("2");
			for (int i = 3; i < Integer.parseInt(line); i++) {
					if (isPrime(i)) {
						output.append("," + i);
					}
			}
			output.append("\n");
			System.out.print(output.toString());
		}
		in.close();
	}

	static boolean isPrime(final int x) {
		boolean prime = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				prime = false;
			}
		}
		return prime;
	}
}