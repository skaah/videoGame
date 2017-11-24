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
		this.setPhysDamage(Wizard.random(20, 50));
		this.setSpeDamage(Wizard.random(100, 200));
		this.setBar(this.getHealthPoint() + ((this.getHealthPoint() * 25) / 100));

	}

	@Override
	protected Integer autoSkill() {
		this.setBar((this.getBar() + ((this.getBar() * 10) / 100)));
		return this.getBar();
	}

	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Wizard.random(1, 5));
		return this.getAutoAttack();
	}

	@Override
	protected Integer phySkill() {
		this.setBar((this.getBar() - ((this.getBar() * 25) / 100)));
		return this.getBar();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Wizard.random(20, 50));
		return getPhysDamage();
	}

	@Override
	protected Integer speSkill() {
		this.setBar((getBar() - ((this.getBar() * 40) / 100)));
		return getBar();
	}

	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Wizard.random(100, 200));
		return getSpeDamage();
	}
}
