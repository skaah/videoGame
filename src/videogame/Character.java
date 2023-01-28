package videogame;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public abstract class Character {

	// VARIABLE //
	private String name;
	private Integer autoAttack;
	private Integer healthPoint;
	private Integer physDamage;
	private Integer speDamage;
	private Integer bar;
	private Integer energy;
	private Integer rage;

	private static Random random = new Random();
	protected static HashMap<String, Character> champ = new HashMap<>();
	// FIN VARIABLE //

	// Fonction de check du montant de la jauge
	/**
	 * @return
	 */
	public Integer checkBar() {
		Integer result = new Integer(5);
		while (result > 3) {
			if ((this.getBar() > ((20 / 100) * this.getBar()))) {
				result = (random(1, 2));
			} else {
				result = 3;
			}

		}
		return result;

	}

	// Fonction de choix de sort aleatoire en focntion du montanrt de
	// BAR(FONCTIONNEL)
	public Integer selectSkill() {
		switch (checkBar()) {
		case 1:
			this.speSkill();
			this.genSpeDamage();
			return getSpeDamage();
		case 2:
			this.phySkill();
			this.genPhyDamage();
			return getPhysDamage();
		case 3:
			this.autoSkill();
			this.genDamage();
			return getAutoAttack();
		}
		return null;

	}

class Main {
	public void main(String[] args) {
	  // Initialisation des variables
	  int bar = 100;
	  int speSkill = 20;
	  int phySkill = 30;
	  int autoSkill = 50;
  
	  // Utilisation de la commande random pour choisir une "case"
	  Random rand = new Random();
	  int choice = rand.nextInt(3);
	  int damage;
	  String skillUsed;
  
	  // Utilisation de la "case" choisie en fonction de la quantité de la valeur de "bar"
	  if (choice == 0) {
		damage = speSkill;
		skillUsed = "speSkill";
	  } else if (choice == 1) {
		damage = phySkill;
		skillUsed = "phySkill";
	  } else {
		damage = autoSkill;
		skillUsed = "autoSkill";
	  }
  
	  // Affichage de la "case" utilisée
	  System.out.printf("%s a été utilisé, causant %d de dégâts", skillUsed, damage);
	}
  }


	// Fonction de choix de sort aleatoire par RANDOM(FONCTIONNEL)
	 public Integer selectSkill() {
	 switch (random(1, 3)) {
	 case 1:
	 genSpeDamage();
	 return getSpeDamage();
	 case 2:
	 genPhyDamage();
	 return getPhysDamage();
	 case 3:
	 genDamage();
	 return getAutoAttack();
	
	 }
	 return null;
	//
	// }

	// Fonction de Combats (FONCTIONNEL)
	public static void beginFight(Character p1, Character p2) throws InterruptedException {
		System.out.printf(
				"Stats de Départ %n %s : %d %n - Energy/Mana/Rage : %d %n %s : %d %n - Energy/Mana/Rage : %d %n ________________ %n",
				p1.getName(), p1.getHealthPoint(), p1.getBar(), p2.getName(), p2.getHealthPoint(), p2.getBar());

		while (p1.getHealthPoint() > 0 && p2.getHealthPoint() > 0) {

			Integer damageP1 = p1.selectSkill();
			Integer damageP2 = p2.selectSkill();

			if ((random(1, 10)) <= 2) {
				p1.setHealthPoint(p1.getHealthPoint() - (damageP2 * 2));
				System.out.println(p2.getName() + " enleve " + (damageP2 * 2) + " points de vie a " + p1.getName()
						+ " <- CRITICAL");
			} else {
				p1.setHealthPoint(p1.getHealthPoint() - damageP2);
				System.out.println(p2.getName() + " enleve " + damageP2 + " points de vie a " + p1.getName());
			}
			if ((random(1, 10)) <= 2) {
				p2.setHealthPoint(p2.getHealthPoint() - (damageP1 * 2));
				System.out.println(p1.getName() + " enleve " + (damageP1 * 2) + " points de vie a " + p2.getName()
						+ " <- CRITICAL");
			} else {
				p2.setHealthPoint(p2.getHealthPoint() - damageP1);
				System.out.println(p1.getName() + " enleve " + damageP1 + " points de vie a " + p2.getName());
			}

			System.out.printf(
					"\n ################## \n \n %s = HP : %d | Bar : %d \n %s = HP : %d | Bar : %d \n _________________\n\n",
					p1.getName(), p1.getHealthPoint(), p1.getBar(), p2.getName(), p2.getHealthPoint(), p2.getBar());
			Thread.sleep(1200);

		}
		if (p1.getHealthPoint() < 0) {
			System.out.printf("%s sort Victorieux dans son duel face à %s ", p2.getName(), p1.getName());
		} else {
			System.out.printf("%s sort Victorieux dans son duel face à %s ", p1.getName(), p2.getName());
		}

	}

	// Fonction de Choix des Combattants (FONCTIONNEL)
	public static void battleChoice() throws InterruptedException {
		String p1 = new String();
		String p2 = new String();

		System.out.println("Voici la liste des champions que vous pouvez faire combattre");
		for (int i = 0; i < champ.size(); i++) {
		}
		System.out.printf(" %s%n", champ.keySet());
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir le 1er champion");
		p1 = sc.nextLine();
		Character c1 = champ.get(p1);
		System.out.println("Veuillez choisir le 2eme champion");
		p2 = sc.nextLine();
		Character c2 = champ.get(p2);
		sc.close();

		beginFight(c1, c2);
	}

	public abstract void generation();

	public Character(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected static Integer random(Integer min, Integer max) {
		return random.nextInt(max - min + 1) + min;

	}

	public Integer getSpeDamage() {
		return speDamage;
	}

	public void setSpeDamage(Integer speDamage) {
		this.speDamage = speDamage;
	}

	public Integer getAutoAttack() {
		return autoAttack;
	}

	public void setAutoAttack(Integer autoAttack) {
		this.autoAttack = autoAttack;
	}

	public Integer getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(Integer healthPoint) {
		this.healthPoint = healthPoint;
	}

	public Integer getPhysDamage() {
		return physDamage;
	}

	public void setPhysDamage(Integer physDamage) {
		this.physDamage = physDamage;
	}

	protected Integer autoSkill() {
		return bar;
	}

	protected Integer genDamage() {
		return autoAttack;
		// TODO Auto-generated method stub

	}

	protected Integer phySkill() {
		return bar;
	}

	protected Integer genPhyDamage() {
		return physDamage;
		// TODO Auto-generated method stub

	}

	protected Integer speSkill() {
		return bar;
	}

	protected Integer genSpeDamage() {
		return speDamage;
		// TODO Auto-generated method stub

	}

	public Integer getBar() {
		return bar;
	}

	public void setBar(Integer i) {
		this.bar = i;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Integer getRage() {
		return rage;
	}

	public void setRage(Integer rage) {
		this.rage = rage;
	}

}