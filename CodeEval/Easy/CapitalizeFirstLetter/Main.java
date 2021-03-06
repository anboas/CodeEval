package CapitalizeFirstLetter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//File file = new File(args[0]);
		File file = new File("J:\\Adam\\School\\ITS-2591\\Workspace\\CodeEval\\src\\input.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		String[] words;

		while ((line = in.readLine()) != null) {
			line = line.trim();
			if (line.length() > 1) {
				words = line.split("\\s+");
				System.out.println(capitalizeFL(words, words.length));
			}
		}
		in.close();
	}
	
	private static String capitalizeFL(String[] words, int wordsLength){
		String output = "";
		for (int i = 0; i < wordsLength; i++){
			output += words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
			output += " ";
		}
		return output;
	}
}