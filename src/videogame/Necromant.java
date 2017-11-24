package videogame;

public class Necromant extends Evil {
	public Necromant(String name) {
		super(name);
		generation();

	}

	@Override
	public void generation() {
		this.setHealthPoint(Necromant.random(350, 450));
		this.setAutoAttack(Necromant.random(1, 5));
		this.setPhysDamage(Necromant.random(25, 45));
		this.setSpeDamage(Necromant.random(150, 220));
		this.setBar(this.getHealthPoint() + ((this.getHealthPoint()*25)/100));

	}
	
	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Necromant.random(1, 5));
		return getAutoAttack();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Necromant.random(25, 45));
		return getPhysDamage();
	}

	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Necromant.random(150, 220));
		return getSpeDamage();
	}

}
