package test.java;

public class Triabulle {
	public static void main(String[] args) {
		int[] tab1 = { 13, 19, 50, 30, 150, 265, 851, 620, 45, 55 };

		compare(tab1);

	}

	static void switchVal(int a, int b, int[] tableau) {
		int temp = tableau[a];
		tableau[a] = tableau[b];
		tableau[b] = temp;
	}

	static void compare(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {

			if (i > i + 1) {
				switchVal(i, i + 1, tableau);
			}
		}
	}
}
