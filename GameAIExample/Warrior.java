package templateMethod;

import java.util.Random;

public class Warrior extends AbstractGameAI {

	public Warrior(String characterName) {
		super(characterName);
	}

	@Override
	public void move() {
		System.out.println("Move 1 Step Forward!");
	}

	@Override
	public void attack() {
		Random r = new Random();
		int damage = r.nextInt(5);
		enemyAi.health -= damage;
		System.out.println("Warrior - Inflicted " + damage + " Damage!");
	}
	
}
