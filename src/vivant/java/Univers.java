package vivant.java;

import java.util.ArrayList;

public class Univers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARATION HOMME/FEMME.
		Homme riri = new Homme("Riri", "Homme", 18, 20, 40);

		Homme fifi = new Homme("Fifi", "Homme", 18, 20, 40);

		Homme loulou = new Homme("Loulou", "Homme", 18, 20, 40);
		Femme bulle = new Femme("Bulle", "Femme", 14, 15, 35);

		Femme belle = new Femme("Belle", "Femme", 14, 15, 35);

		Femme rebelle = new Femme("Rebelle", "Femme", 14, 15, 35);

		// TABLEAU HOMME/FEMME.
		ArrayList<Human> listHuman = new ArrayList<Human>();
		listHuman.add(riri);
		listHuman.add(fifi);
		listHuman.add(loulou);
		listHuman.add(bulle);
		listHuman.add(belle);
		listHuman.add(rebelle);

		// AFFICHAGE AUTOMATIQUE HOMME/FEMME.
//		riri.affichage();
//		fifi.affichage();
//		loulou.affichage();
//
//		bulle.affichage();
//		belle.affichage();
//		rebelle.affichage();
		
		//forEach
		for (Human human : listHuman) {
			System.out.printf("%s %s %d Kg\n", human.name, human.sex, human.weight);
			
		}
	}

}
