package templateMethod;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		Warrior bob = new Warrior("Bob");
		Warrior alice = new Warrior("Alice");
		bob.setEnemyAi(alice);
		alice.setEnemyAi(bob);

		while (bob.isAlive() && alice.isAlive())
		{
			bob.MakeTurn();
			alice.MakeTurn();
		} 

	}
}
