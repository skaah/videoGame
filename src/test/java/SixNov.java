package test.java;

public class SixNov {
	public static void main(String[] args) {
		int[] tab1 = { 13, 19, 50, 30, 150, 265, 851, 620, 45, 55 };

		triTab(tab1);
		afficherTab(tab1);
	}

	static int calculMax(int[] tableau, int taille) {
		int indicemax = 0;
		for (int i = 0; i <= taille; i++) {
			if (tableau[indicemax] < tableau[i]) {
				indicemax = i;
			}
		}
		return indicemax;
	}

	static void switchVal(int a, int b, int[] tableau) {
		int temp = tableau[a];
		tableau[a] = tableau[b];
		tableau[b] = temp;
	}

	static int afficherTab(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
		return 0;
	}

	static int triTab(int[] tableau) {
		for (int i = tableau.length - 1; i > 0; i--) {
			int max = calculMax(tableau, i);
			switchVal(i , max, tableau);

		}
		return 0;
	}

	
}