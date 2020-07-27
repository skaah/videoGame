package test.java;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer x = new Integer(0);
		Boolean check = new Boolean(false);

		check = new Boolean(false);

		while (check == false) {
			System.out.println("Renseignez une valeur entre : \n 1 : Ouvrir \n 2 : Quitter \n 3 : Sauver");
			x = new Integer(sc.nextInt());
			// sc.close();
			switch (x) {
			case 1:
				System.out.println("Ouverture en cours.");
				check = new Boolean(true);
				break;
			case 2:
				System.out.println("Fermeture en cours.");
				check = new Boolean(true);
				break;
			case 3:
				System.out.println("Sauvegarde en cours.");
				check = new Boolean(true);
				break;
			default:
				System.out.println("La valeur renseigné n'est pas reconnue");

			}

		}
		sc.close();

	}
	
	public Integer switchRec(Integer a) {
		
		
		
		
		return 0;
		
	}
}
