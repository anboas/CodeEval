package ageDistribution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		Map<Integer, String> map = new HashMap<Integer, String>();
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			int lineArray = Integer.parseInt(line);
			//String[] lineArray = line.split("\\s+");
			for (int i = (lineArray-1); i <= -1; ++i){map.put(i, "This program is for humans");}
			for (int i = 0; i <= 2; ++i){map.put(i,"Still in Mama's arms");}
			for (int i = 3; i <= 4; ++i){map.put(i,"Preschool Maniac");}
			for (int i = 5; i <= 11; ++i){map.put(i, "Elementary school");}
			for (int i = 12; i <= 14; ++i){map.put(i, "Middle school");}
			for (int i = 15; i <= 18; ++i){map.put(i, "High school");}
			for (int i = 19; i <= 22; ++i){map.put(i, "College");}
			for (int i = 23; i <= 65; ++i){map.put(i, "Working for the man");}
			for (int i = 66; i <= 100; ++i){map.put(i, "The Golden Years");}
			for (int i = 101; i <= 10000; ++i){map.put(i, "This program is for humans");}
			System.out.print(map.get(lineArray) + "\n");
		}
		in.close();
	}
}