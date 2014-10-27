package NextToLastWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		//File file = new File("J:\\Adam\\School\\ITS-2591\\Workspace\\CodeEval\\src\\input.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		String[] words;

		while ((line = in.readLine()) != null) {
			line = line.trim();
			if (line.length() > 1) {
				words = line.split("\\s+");
				System.out.println(getNTL(words, words.length));
			}
		}
		in.close();
	}
	
	private static String getNTL(String[] words, int wordsLength){
		String output = "";
		if (wordsLength > 0){
			output += words[wordsLength -2];
		}
		return output;
	}
}