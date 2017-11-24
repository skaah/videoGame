package videogame;

public abstract class Test extends Character {

	public Test(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		// SORCERY DJIDAN'S MATE.
		Wizard bibi = new Wizard("Bibi");

		// ROBIN WOOD.
		Archer robin = new Archer("Robin");

		// WARRIOR - Defender of Alexandria.
		Warrior steiner = new Warrior("Steiner");

		// GUY FROM HELL.
		Necromant nerzhul = new Necromant("Ner'zhul");

		// BECAREFUL OF YOU'RE BACK MAN, SHADOWMAN IS NEAR.
		Assassin akame = new Assassin("Akame");

		// DONT ENRAGE HIM !!!!
		Berserker garosh = new Berserker("Garosh");

		// DECLARATION CHAMP TAB
		champ.put("Bibi", bibi);
		champ.put("Robin", robin);
		champ.put("Steiner", steiner);
		champ.put("Ner'Zhul", nerzhul);
		champ.put("Akame", akame);
		champ.put("Garosh", garosh);
		
		System.out.println(bibi.getHealthPoint());
		System.out.println(bibi.getBar());
		
		System.out.println(robin.getBar());

//		battleChoice();

	}

}
