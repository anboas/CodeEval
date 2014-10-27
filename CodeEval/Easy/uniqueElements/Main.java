package uniqueElements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(final String[] args) throws IOException {

		final BufferedReader in = new BufferedReader(new FileReader(new File(
				args[0])));
		String line;

		while ((line = in.readLine()) != null) {
			final String[] number = line.split(",");
			final StringBuilder output = new StringBuilder();
			Integer prevNumber = null;

			for (int i = 0; i < number.length; i++) {

				final int currentElement = Integer.parseInt(number[i]);
				if (prevNumber == null || currentElement > prevNumber) {

					output.append(currentElement);
					prevNumber = currentElement;

					if (!number[i].equals(number[number.length - 1])) {
						output.append(",");
					}
				}
			}
			System.out.println(output.toString());
		}
		in.close();
	}
}
