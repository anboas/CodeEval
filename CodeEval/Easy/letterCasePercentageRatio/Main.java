package letterCasePercentageRatio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		DecimalFormat decForm = new DecimalFormat("#0.00");
		String line;
		double isUpper, isLower;

		while ((line = in.readLine()) != null) {
			isUpper = 0;
			isLower = 0;

			String[] lineArray = line.split("(?!^)");
			for (int i = 0; i < lineArray.length; i++) {
				if (Character.isLetter(lineArray[i].charAt(0))) {
					if (Character.isUpperCase(lineArray[i].charAt(0))) {
						isUpper += 1;
					} else {
						isLower += 1;
					}
				}
			}
			System.out.println("lowercase: "
					+ decForm.format((isLower/(isUpper + isLower)) * 100) + " uppercase: "
					+ decForm.format((isUpper/(isUpper + isLower)) * 100));
		}
		in.close();
	}
}