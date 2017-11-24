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
		this.setRage(Warrior.random(1, 12));
		this.setBar(this.getRage());

	}

	@Override
	protected Integer autoSkill() {
		this.setBar((getBar() + 18));
		return getBar();
	}

	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Warrior.random(15, 30));
		this.setBar((getBar() + (getBar() * (10 / 100))));
		return getAutoAttack();
	}

	@Override
	protected Integer phySkill() {
		this.setBar((getBar() - 35));
		return getBar();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Warrior.random(80, 120));
		return getPhysDamage();
	}

	@Override
	protected Integer speSkill() {
		this.setBar((getBar() - 55));
		return getBar();
	}

	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Warrior.random(30, 60));
		return getSpeDamage();
	}
}
