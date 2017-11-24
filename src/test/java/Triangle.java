package test.java;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// System.out.println("Choisssez une Valeur Afin de déssiner le triangle ?");
		// int valtri = sc.nextInt();
		//
		// for (int k = 1; k <= valtri; k++) {
		// for (int j = 1; j <= valtri; j++) {
		// if (j <= k) {
		// System.out.print("*");
		// }
		// }
		// System.out.println("");
		// }
		//
		// System.out.println("Choisssez le nombre de Ligne ?");
		// int valligne = sc.nextInt();
		//
		// for (int k = 1; k <= valligne; k++) {
		// for (int j = 1; j <= valligne; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		//
		// }

		System.out.println("Choisssez une Hauteur ?");
		int valhaut = sc.nextInt();
		System.out.println("Choisssez une Largeur ?");
		int vallarg = sc.nextInt();
		sc.close();

		for (int i = 0; i < valhaut; i++) {
			for (int j = 0; j < vallarg; j++) {
				if (j == 0 || j < valhaut || i < vallarg || i == 0) {
					System.out.print("*");
				}
				System.out.print("");
			}
			System.out.println();
		}
	}
}
