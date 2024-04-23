package _21670310075_Albaraa_Basha;

import java.util.LinkedList;

public class _21670310075_Albaraa_Basha_Main {

	public static void main(String[] args) {

		_21670310075_Albaraa_Basha_start st = new _21670310075_Albaraa_Basha_start();
		_21670310075_Albaraa_Basha_ifadeDuzeltme tr = new _21670310075_Albaraa_Basha_ifadeDuzeltme();
		_21670310075_Albaraa_Basha_FHesaplama f = new _21670310075_Albaraa_Basha_FHesaplama();
		_21670310075_Albaraa_Basha_printTable prt = new _21670310075_Albaraa_Basha_printTable();

		LinkedList<Character> charList = st.getCharList();
		char fonksiyonIsmi = charList.get(0);
		int[] fDegeri = f.hesaplaF(charList, tr.terimler(charList), tr.karakterler(charList));

		prt.yazdir(fonksiyonIsmi, fDegeri, tr.karakterler(charList));
	}
}
