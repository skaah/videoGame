package videogame;

public class Wizard extends Good {

	public Wizard(String name) {
		super(name);
		generation();

	}

	@Override
	public void generation() {
		this.setHealthPoint(Wizard.random(300, 500));
		this.setAutoAttack(Wizard.random(1, 5));
		// this.skill.put(1, Wizard.random(1, 5));
		this.setPhysDamage(Wizard.random(20, 50));
		// this.skill.put(2, Wizard.random(20, 50));
		this.setSpeDamage(Wizard.random(100, 200));
		// this.skill.put(3, Wizard.random(100, 200));
		this.setEnergyBar(Energy.MANA);

	}

	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Wizard.random(1, 5));
		return getAutoAttack();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Wizard.random(20, 50));
		return getPhysDamage();
	}
	
	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Wizard.random(100, 200));
		return getSpeDamage();
	}
}
