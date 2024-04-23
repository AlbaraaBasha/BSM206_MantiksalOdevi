package _21670310075_Albaraa_Basha;

import java.util.ArrayList;

public class _21670310075_Albaraa_Basha_printTable {

	private int[] A = new int[16];
	private int[] B = new int[16];
	private int[] C = new int[16];
	private int[] D = new int[16];

	public void yazdir(char fonksiyonIsmi, int[] F, ArrayList<Character> arr) {

		dogrulukTablosu(fonksiyonIsmi, F, arr);
		minUzun(fonksiyonIsmi, F, arr);
		minKisa(fonksiyonIsmi, F);
		maxUzun(fonksiyonIsmi, F, arr);
		maxKisa(fonksiyonIsmi, F);

	}

	public void dogrulukTablosu(char fonksiyonIsmi, int[] F, ArrayList<Character> arr) {
		_21670310075_Albaraa_Basha_truthTable bo = new _21670310075_Albaraa_Basha_truthTable();
		bo.a(A);
		bo.b(B);
		bo.c(C);
		bo.d(D);

		System.out.println("doğruluk tablosu:");
		System.out.println();
		System.out.println(arr.get(0) + " " + arr.get(1) + " " + arr.get(2) + " " + arr.get(3) + " " + fonksiyonIsmi);
		for (int i = 0; i < 16; i++) {
			System.out.print(A[i] + " " + B[i] + " " + C[i] + " " + D[i] + " " + F[i]);
			System.out.println();
		}

	}

	public void minUzun(char fonksiyonIsmi, int[] F, ArrayList<Character> arr) {
		StringBuilder ifade = new StringBuilder();

		System.out.println("Fonksiyon İfadeleri:");
		ifade.append(fonksiyonIsmi + " = ");
		if (F[0] == 1)
			ifade.append(arr.get(0) + "'" + arr.get(1) + "'" + arr.get(2) + "'" + arr.get(3) + "' + ");
		if (F[1] == 1)
			ifade.append(arr.get(0) + "'" + arr.get(1) + "'" + arr.get(2) + "'" + arr.get(3) + " + ");
		if (F[2] == 1)
			ifade.append(arr.get(0) + "'" + arr.get(1) + "'" + arr.get(2) + "" + arr.get(3) + "' + ");
		if (F[3] == 1)
			ifade.append(arr.get(0) + "'" + arr.get(1) + "'" + arr.get(2) + "" + arr.get(3) + " + ");
		if (F[4] == 1)
			ifade.append(arr.get(0) + "'" + arr.get(1) + "" + arr.get(2) + "'" + arr.get(3) + "' + ");
		if (F[5] == 1)
			ifade.append(arr.get(0) + "'" + arr.get(1) + "" + arr.get(2) + "'" + arr.get(3) + " + ");
		if (F[6] == 1)
			ifade.append(arr.get(0) + "'" + arr.get(1) + "" + arr.get(2) + "" + arr.get(3) + "' + ");
		if (F[7] == 1)
			ifade.append(arr.get(0) + "'" + arr.get(1) + "" + arr.get(2) + "" + arr.get(3) + " + ");
		if (F[8] == 1)
			ifade.append(arr.get(0) + "" + arr.get(1) + "'" + arr.get(2) + "'" + arr.get(3) + "' + ");
		if (F[9] == 1)
			ifade.append(arr.get(0) + "" + arr.get(1) + "'" + arr.get(2) + "'" + arr.get(3) + " + ");
		if (F[10] == 1)
			ifade.append(arr.get(0) + "" + arr.get(1) + "'" + arr.get(2) + "" + arr.get(3) + "' + ");
		if (F[11] == 1)
			ifade.append(arr.get(0) + "" + arr.get(1) + "'" + arr.get(2) + "" + arr.get(3) + " + ");
		if (F[12] == 1)
			ifade.append(arr.get(0) + "" + arr.get(1) + "" + arr.get(2) + "'" + arr.get(3) + "' + ");
		if (F[13] == 1)
			ifade.append(arr.get(0) + "" + arr.get(1) + "" + arr.get(2) + "'" + arr.get(3) + " + ");
		if (F[14] == 1)
			ifade.append(arr.get(0) + "" + arr.get(1) + "" + arr.get(2) + "" + arr.get(3) + "' + ");
		if (F[15] == 1)
			ifade.append(arr.get(0) + "" + arr.get(1) + "" + arr.get(2) + "" + arr.get(3) + " + ");

		ifade.setLength(ifade.length() - 3);
		System.out.println(ifade);
	}

	public void minKisa(char fonksiyonIsmi, int[] F) {

		StringBuilder minterimler = new StringBuilder();
		minterimler.append(fonksiyonIsmi + " = Σ(");
		for (int i = 0; i < F.length; i++) {
			if (F[i] == 1)
				minterimler.append(i + ", ");
		}
		minterimler.setLength(minterimler.length() - 2);
		minterimler.append(")");
		System.out.println(minterimler);
	}

	public void maxUzun(char fonksiyonIsmi, int[] F, ArrayList<Character> arr) {
		StringBuilder maxifade = new StringBuilder();
		maxifade.append(fonksiyonIsmi + " = ");

		if (F[0] == 0)
			maxifade.append(
					"(" + arr.get(0) + "" + "+" + arr.get(1) + "" + "+" + arr.get(2) + "" + "+" + arr.get(3) + ").");
		if (F[1] == 0)
			maxifade.append(
					"(" + arr.get(0) + "" + "+" + arr.get(1) + "" + "+" + arr.get(2) + "" + "+" + arr.get(3) + "').");
		if (F[2] == 0)
			maxifade.append(
					"(" + arr.get(0) + "" + "+" + arr.get(1) + "" + "+" + arr.get(2) + "'" + "+" + arr.get(3) + ").");
		if (F[3] == 0)
			maxifade.append(
					"(" + arr.get(0) + "" + "+" + arr.get(1) + "" + "+" + arr.get(2) + "'" + "+" + arr.get(3) + "').");
		if (F[4] == 0)
			maxifade.append(
					"(" + arr.get(0) + "" + "+" + arr.get(1) + "'" + "+" + arr.get(2) + "" + "+" + arr.get(3) + ").");
		if (F[5] == 0)
			maxifade.append(
					"(" + arr.get(0) + "" + "+" + arr.get(1) + "'" + "+" + arr.get(2) + "" + "+" + arr.get(3) + "').");
		if (F[6] == 0)
			maxifade.append(
					"(" + arr.get(0) + "" + "+" + arr.get(1) + "'" + "+" + arr.get(2) + "'" + "+" + arr.get(3) + ").");
		if (F[7] == 0)
			maxifade.append(
					"(" + arr.get(0) + "" + "+" + arr.get(1) + "'" + "+" + arr.get(2) + "'" + "+" + arr.get(3) + "').");
		if (F[8] == 0)
			maxifade.append(
					"(" + arr.get(0) + "'" + "+" + arr.get(1) + "" + "+" + arr.get(2) + "" + "+" + arr.get(3) + ").");
		if (F[9] == 0)
			maxifade.append(
					"(" + arr.get(0) + "'" + "+" + arr.get(1) + "" + "+" + arr.get(2) + "" + "+" + arr.get(3) + "').");
		if (F[10] == 0)
			maxifade.append(
					"(" + arr.get(0) + "'" + "+" + arr.get(1) + "" + "+" + arr.get(2) + "'" + "+" + arr.get(3) + ").");
		if (F[11] == 0)
			maxifade.append(
					"(" + arr.get(0) + "'" + "+" + arr.get(1) + "" + "+" + arr.get(2) + "'" + "+" + arr.get(3) + "').");
		if (F[12] == 0)
			maxifade.append(
					"(" + arr.get(0) + "'" + "+" + arr.get(1) + "'" + "+" + arr.get(2) + "" + "+" + arr.get(3) + ").");
		if (F[13] == 0)
			maxifade.append(
					"(" + arr.get(0) + "'" + "+" + arr.get(1) + "'" + "+" + arr.get(2) + "" + "+" + arr.get(3) + "').");
		if (F[14] == 0)
			maxifade.append(
					"(" + arr.get(0) + "'" + "+" + arr.get(1) + "'" + "+" + arr.get(2) + "'" + "+" + arr.get(3) + ").");
		if (F[15] == 0)
			maxifade.append("(" + arr.get(0) + "'" + "+" + arr.get(1) + "'" + "+" + arr.get(2) + "'" + "+" + arr.get(3)
					+ "').");

		maxifade.setLength(maxifade.length() - 1);
		System.out.println(maxifade);
	}

	public void maxKisa(char fonksiyonIsmi, int[] F) {
		StringBuilder maxterimler = new StringBuilder();
		maxterimler.append(fonksiyonIsmi + " = ∏(");
		for (int i = 0; i < F.length; i++) {
			if (F[i] == 0)
				maxterimler.append(i + ", ");
		}
		maxterimler.setLength(maxterimler.length() - 2);
		maxterimler.append(")");
		System.out.println(maxterimler);
	}

}
