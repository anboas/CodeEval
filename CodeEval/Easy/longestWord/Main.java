package longestWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String li = "", lW = "";
		String[] cW;
		try {
			File fi = new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(fi));
			while ((li = br.readLine()) != null) {
				cW = li.split("\\s+");
				for (int i = 0; i < cW.length; i++) {
					if (cW[i].length() > lW.length()) {
						lW = cW[i];
					}
				}
				System.out.println(lW);
				lW = "";
			}
			br.close();
		} catch (IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}
}