package videogame;

public class Assassin extends Evil {
	
	public Assassin(String name) {
		super(name);
		generation();

	}

	@Override
	public void generation() {
		this.setHealthPoint(Assassin.random(420, 650));
		this.setAutoAttack(Assassin.random(20, 35));
		this.setPhysDamage(Assassin.random(85, 125));
		this.setSpeDamage(Assassin.random(30, 60));
		this.setEnergyBar(Energy.STAMINA);
	}
	
	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Assassin.random(20, 35));
		return getAutoAttack();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Assassin.random(85, 125));
		return getPhysDamage();
	}

	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Assassin.random(30, 60));
		return getSpeDamage();
	}

}
