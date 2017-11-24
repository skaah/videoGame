package videogame;

public class Warrior extends Good {
	public Warrior(String name) {
		super(name);
		generation();

	}

	@Override
	public void generation() {
		this.setHealthPoint(Warrior.random(500, 1000));
		this.setAutoAttack(Warrior.random(15, 30));
		this.setPhysDamage(Warrior.random(80, 120));
		this.setSpeDamage(Warrior.random(30, 60));
		this.setEnergyBar(Energy.RAGE);

	}

	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Warrior.random(15, 30));
		return getAutoAttack();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Warrior.random(80, 120));
		return getPhysDamage();
	}

	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Wizard.random(30, 60));
		return getSpeDamage();
	}
}
