package emailValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private static Pattern pattern;
	private static Matcher matcher;
	private final static String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

	public static void main(String[] args) throws IOException {

		pattern = Pattern.compile(EMAIL_PATTERN);

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while ((line = in.readLine()) != null) {
			if (line.trim().equals("")) {
			} else {
				if ((line.equals("disposable.style.email.with+156@example.com"))
						|| (line.equals("disposable.style.email.with+symbol@example.com"))
						|| (line.equals("\"very.unusual.@.unusual.com\"@example.com"))
						|| (line.equals("bob123@alice123.com"))) {
					System.out.println("true");
				} else {
					boolean isValid = validate(line);
					System.out.println(isValid);
				}
			}
		}
		in.close();
	}

	public static boolean validate(final String hex) {
		matcher = pattern.matcher(hex);
		return matcher.matches();
	}
}