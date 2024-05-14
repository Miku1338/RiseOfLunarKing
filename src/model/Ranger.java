package model;

public class Ranger extends Character {
	public Ranger(int hp, int attackSpeed, int agility) {
		this.hp = hp;
		this.attackSpeed = attackSpeed;
		this.agility = agility;
	}
	
	public int getAttackSpeed() {
		return attackSpeed + agility;
	}
}
