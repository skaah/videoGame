package vivant.java;

public class Human {
	protected String name;
	protected String sex;
	protected Integer age;
	protected Integer weight;
	protected Integer height;
	
	// FONCTION HUMAIN + CONSTRUCTEUR.
	public Human(String name, String sex, Integer age, Integer weight, Integer height) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	// FONCTION AFFICHAGE AUTOMATIQUE HOMME/FEMME.
	public void affichage() {
		if (this.sex.equals("Homme")) {
			System.out.print("Bonjour je m'appelle " + this.name + ", je suis un " + this.sex + " de " + this.age
					+ " ans \nje pese " + this.weight + " Kg pour une taille de " + this.height + " cm.\n\n");

		} else {
			System.out.print("Bonjour je m'appelle " + this.name + ", je suis une " + this.sex + " de " + this.age
					+ " ans \nje pese " + this.weight + " Kg pour une taille de " + this.height + " cm.\n\n");
		}

	}
}
