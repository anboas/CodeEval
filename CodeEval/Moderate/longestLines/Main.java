package longestLines;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeMap;

/*
 *  Write a program which reads a file and prints to stdout
 *  the specified number of the longest lines that are sorted
 *  based on their length in descending order.
 * 
 *   Input sample:
 *    Your program should accept a path to a file as its first argument.
 *    The file contains multiple lines. The first line indicates the
 *    number of lines you should output, the other lines are of
 *    different length and are presented randomly. You may assume
 *    that the input file is formatted correctly and the number in
 *    the first line is a valid positive integer.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// File file = new File(args[0]);
		File file = new File(
				"E:\\Users\\whspr\\git\\CodeEval\\CodeEval\\Moderate\\longestLines\\input.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		int lineIndex = 0;
		int linesToPrint = 0;
		TreeMap<Integer, String> lines = new TreeMap<Integer, String>(Collections.reverseOrder());

		while ((line = in.readLine()) != null) {
			if(lineIndex >= 1){
				lines.put(line.length(), line);
			} else {
				lineIndex++;
				linesToPrint = Integer.parseInt(line);
			}
			System.out.println(line);
		}
		System.out.println(lines.toString());

		in.close();
	}
}