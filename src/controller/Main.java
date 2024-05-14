package controller;

import model.Character;
import model.Ranger;
import model.Wizard;

public class Main {
	public static void main(String[] args) {
		Character wizard = new Wizard(10, 1, 1);
		
		// check the wizard's attack speed
		System.out.println("Wizards attack speed is: " + wizard.getAttackSpeed());
		
		Character ranger = new Ranger(10, 1, 1);
		System.err.println("Rangers attack speed is: " + ranger.getAttackSpeed());
		
		wizard.takeDamage(5);
		System.out.println("Wizards remaining hp is: " + wizard.getHP());
	}
}
