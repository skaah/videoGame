package test.java;

public class FonctionEtProc {

	public static void main(String[] args) {
		int[] tab1 = { 1, 5, 6, 8, 9, 47, 8 };
		int[] tab2 = { 2, 5, 12, 84, 225, 45, 10, 16 };
		String[] tab3 = { "test", "test2", "test3" };

		affichageDuTabEntier(tab1);
		affichageDuTabEntier(tab2);
		affichageDuTabStr(tab3);
		System.out.println(plusGrandChiffre(tab2));
		System.out.println(plusPetitChiffre(tab2));
		System.out.println(calculMoyenne(tab2));

	}

	// Procédure affichage d'un tableau d'entier
	static void affichageDuTabEntier(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);

		}
	}

	// Procédure affichage d'un tableau de suite de caracteres
	static void affichageDuTabStr(String[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

	}

	// Fonction du plus grand chiffre du tableau
	public static int plusGrandChiffre(int[] tableau) {
		int max = 0;
		for (int i = 0; i < tableau.length; i++) {

			if (max < tableau[i]) {
				max = tableau[i];
			}
		}
		return max;
	}

	// Fonction du plus petit chiffre du tableau
	public static int plusPetitChiffre(int[] tableau) {
		int min = 10000;
		for (int i = 0; i < tableau.length; i++) {

			if (min > tableau[i]) {
				min = tableau[i];
			}
		}
		return min;
	}

	// calcule de la moyenne
	public static int calculMoyenne(int[] tableau) {
		int somme = 0;
		for (int i = 0; i < tableau.length; i++) {
			somme = somme + tableau[i];
		}
		return somme / tableau.length;
	}
}
