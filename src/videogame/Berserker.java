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
//		this.setRageBar(getRageBar());

	}
	
	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Berserker.random(15,30));
		return getAutoAttack();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Berserker.random(90, 135));
		return getPhysDamage();
	}

	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Berserker.random(20, 40));
		return getSpeDamage();
	}
}
