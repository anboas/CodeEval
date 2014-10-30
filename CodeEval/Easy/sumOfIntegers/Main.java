package sumOfIntegers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		//File file = new File("E:\\Users\\whspr\\git\\CodeEval\\CodeEval\\Easy\\sumOfIntegers\\input.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		int sumOfIntegers = 0;

		while ((line = in.readLine()) != null) {
			line = line.trim();
			sumOfIntegers += Integer.parseInt(line);
		}
		System.out.println(sumOfIntegers);
		in.close();
	}
}