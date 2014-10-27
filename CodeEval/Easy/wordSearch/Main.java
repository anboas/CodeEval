package wordSearch;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	private static final char[][] PUZZLE = { 
		{ 'a', 'b', 'c', 'e' },
		{ 's', 'f', 'c', 's' },
		{ 'a', 'd', 'e', 'e' } };

	public static void main(String[] args) throws IOException {
		//File file = new File(args[0]);
		File file = new File("J:\\Adam\\School\\ITS-2591\\Workspace\\CodeEval\\src\\wordSearch\\input.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(PUZZLE.length);
			line = line.trim().toLowerCase();
			if (hasWord(line.toCharArray())) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
		in.close();
	}

	private static boolean hasWord(char[] word) {
		boolean[][] used = new boolean[3][4];
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 4; j++) {
						used[i][j] = false;
					}
				}
				if (hasWord(PUZZLE, used, word, 0, row, col)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean hasWord(char[][] grid, boolean[][] used,
			char[] word, int index, int row, int col) {
		if (row < 0 || row == 3 || col < 0 || col == 4) {
			return false;
		}
		if (used[row][col]) {
			return false;
		}
		if (grid[row][col] != word[index]) {
			return false;
		}
		used[row][col] = true;
		if (index + 1 == word.length) {
			return true;
		}
		return hasWord(grid, used, word, index + 1, row + 1, col)
				|| hasWord(grid, used, word, index + 1, row - 1, col)
				|| hasWord(grid, used, word, index + 1, row, col - 1)
				|| hasWord(grid, used, word, index + 1, row, col + 1);
	}
}