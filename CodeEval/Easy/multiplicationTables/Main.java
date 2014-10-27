package multiplicationTables;

public class Main {
	public static void main(String[] args) {
		int columnOut = 12;
		int currentCol = 1;
		int rowOut = 12;
		int currentRow = 1;

		StringBuilder chart = new StringBuilder();

		for (int i = 1; i <= rowOut*columnOut; i++) {
			if (currentCol < columnOut){
				System.out.printf("%4d", (currentCol*currentRow));
			} else if (currentCol == columnOut) {
				System.out.printf("%4d",(currentCol*currentRow));
				System.out.println();
				currentCol = 0;
				currentRow++;
			}
			currentCol++;

		}
		System.out.print(chart.toString());
	}
}