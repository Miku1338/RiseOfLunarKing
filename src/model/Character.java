package model;

public abstract class Character {
	protected int hp;
	protected int attackSpeed;
	protected int agility;
	
	public int getHP() {
		return hp;
	}
	
	public int getAttackSpeed() {
		return attackSpeed;
	}
	
	public void takeDamage(int amount) {
		hp -= amount;
	}
}
