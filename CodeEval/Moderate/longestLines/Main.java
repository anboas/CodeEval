package longestLines;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
				"E:\\Users\\whspr\\git\\CodeEval\\CodeEval\\Medium\\longestLines\\input.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while ((line = in.readLine()) != null) {

		}

		in.close();
	}
}