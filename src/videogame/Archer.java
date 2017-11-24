package videogame;

public class Archer extends Good {

	public Archer(String name) {
		super(name);
		generation();

	}

	@Override
	public void generation() {
		this.setHealthPoint(Archer.random(400, 600));
		this.setAutoAttack(Archer.random(10, 25));
		this.setPhysDamage(Archer.random(100, 200));
		this.setSpeDamage(Archer.random(60, 100));
		this.setEnergy(Archer.random(100, 125));
		this.setBar(this.getEnergy());
	}
	
	@Override
	protected Integer genDamage() {
		this.setAutoAttack(Archer.random(10, 25));
		return getAutoAttack();
	}

	@Override
	protected Integer genPhyDamage() {
		this.setPhysDamage(Archer.random(100, 200));
		return getPhysDamage();
	}
	
	@Override
	protected Integer genSpeDamage() {
		this.setSpeDamage(Archer.random(60, 100));
		return getSpeDamage();
	}
}
