package _21670310075_Albaraa_Basha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class _21670310075_Albaraa_Basha_ifadeDuzeltme {

	private List<String> words = new ArrayList<>();

	public List<String> terimler(LinkedList<Character> charList) {
		StringBuilder strb = new StringBuilder();
		for (int i = 1; i < charList.size(); i++) {

			if (charList.get(i) != '+') {
				strb.append(charList.get(i));
			} else {
				words.add(strb.toString());
				strb = new StringBuilder();
			}

		}
		words.add(strb.toString());
		return words;
	}

	public ArrayList<Character> karakterler(LinkedList<Character> charList) {
		TreeSet<Character> value = new TreeSet<Character>();
		for (int i = 1; i < charList.size(); i++) {
			char c = charList.get(i);
			if (Character.isLetter(c))
				value.add(c);
		}
		ArrayList<Character> arr = new ArrayList<>(value);
		return arr;
	}

}
