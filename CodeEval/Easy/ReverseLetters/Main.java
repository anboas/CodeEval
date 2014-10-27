package ReverseLetters;

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

		while ((line = in.readLine()) != null) {
			line = line.trim();
			line = reverse(line, line.length());
			System.out.println(line);
		}
		in.close();
	}
	
	public static String reverse(String sentence, int sentenceLength) {

		while (sentenceLength > 0){
			return sentence.substring(sentenceLength - 1) + reverse(sentence.substring(0, sentenceLength - 1), --sentenceLength);
		}
		return sentence;
		}
}