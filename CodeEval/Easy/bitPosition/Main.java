package bitPosition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int n,p1,p2;
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split(",");
			n = Integer.parseInt(lineArray[0]);
			p1 = Integer.parseInt(lineArray[1]);
			p2 = Integer.parseInt(lineArray[2]);
			if ( ((n >> (p1 - 1)) & 1) == ((n >> (p2 - 1)) & 1) ) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
		in.close();
	}
}