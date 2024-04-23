package _21670310075_Albaraa_Basha;

public class _21670310075_Albaraa_Basha_truthTable {

	public void a(int[] a) {
		for (int i = 0; i < 16; i++) {
			if (i < 8)
				a[i] = 0;
			else
				a[i] = 1;
		}
	}

	public void b(int[] a) {
		for (int i = 0; i < 16; i++) {
			if (i % 8 == 0 || i % 8 == 1 || i % 8 == 2 || i % 8 == 3)
				a[i] = 0;
			else
				a[i] = 1;
		}

	}

	public void c(int[] a) {
		for (int i = 0; i < 16; i++) {
			if (i % 4 == 0 || i % 4 == 1)
				a[i] = 0;
			else
				a[i] = 1;
		}
	}

	public void d(int[] a) {
		for (int i = 0; i < 16; i++) {
			if (i % 2 == 0)
				a[i] = 0;
			else
				a[i] = 1;
		}
	}

}
