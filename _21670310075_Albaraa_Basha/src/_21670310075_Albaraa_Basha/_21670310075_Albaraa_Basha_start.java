package _21670310075_Albaraa_Basha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class _21670310075_Albaraa_Basha_start {
	private LinkedList<Character> charList = new LinkedList<>();

	public LinkedList<Character> getCharList() {
		String line = "";

		try {
			Scanner scanner = new Scanner(new File("boole.txt"));
			line = scanner.nextLine();
			System.out.println("boole.txt dosyası okundu.");
			for (char c : line.toCharArray()) {
				if (c != ' ' && c != '=')
					charList.add(c);
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return charList;

	}

}
