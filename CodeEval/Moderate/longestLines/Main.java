package longestLines;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//File file = new File(args[0]);
		File file = new File("E:\\Users\\whspr\\git\\CodeEval\\CodeEval\\Medium\\longestLines\\input.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while ((line = in.readLine()) != null) {


		}

		in.close();
	}
}