package OddNumbers;

public class Main {

	public static void main(String[] args) {
		int numbers = 0;

		while (numbers < 100) {
			if (numbers % 2 == 1) {
				System.out.println(numbers);
			}
			numbers++;
		}
	}
}
