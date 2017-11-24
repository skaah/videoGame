package videogame;

public class Berserker extends Evil {
	public Berserker(String name) {
		super(name);
		generation();

	}

	@Override
	public void generation() {
		this.setHealthPoint(Berserker.random(550, 850));
		this.setAutoAttack(Berserker.random(15, 30));
		this.setPhysDamage(Berserker.random(90, 135));
		this.setSpeDamage(Berserker.random(20, 40));
		this.setRage(Berserker.random(1, 18));
		this.setBar(this.getRage());

	}

	@Override
	protected Integer autoSkill() {
		this.setBar((getBar() + 25));
		return getBar();
	}

	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Berserker.random(15, 30));
		return getAutoAttack();
	}

	@Override
	protected Integer phySkill() {
		this.setBar((getBar() - 35));
		return getBar();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Berserker.random(90, 135));
		return getPhysDamage();
	}

	@Override
	protected Integer speSkill() {
		this.setBar((getBar() - 55));
		return getBar();
	}

	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Berserker.random(20, 40));
		return getSpeDamage();
	}
}
