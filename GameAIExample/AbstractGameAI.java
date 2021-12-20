package templateMethod;

public abstract class AbstractGameAI {
	protected int health = 5;
	protected String name;
	protected AbstractGameAI enemyAi;

	public AbstractGameAI(String characterName) {
		this.name = characterName;
	}

	public void setEnemyAi(AbstractGameAI enemyAi) {
		this.enemyAi = enemyAi;
	}

	public boolean isAlive() {
		return health > 0;
	}

//	Template method 
	public final void MakeTurn() {
		startTurn();
		if (isAlive()) {
			move();
			attack();
		}
		endTurn();
	}

// 	abstract methods implemented by client 
	public abstract void move();
	public abstract void attack();

//  implementations of some steps are defined in base class
	private final void startTurn() {
		System.out.print("== " + name + " | ");
		System.out.print("HP:" + health + " ==\n");
	}

	private final void endTurn() {
		if (isAlive())
			System.out.println("==== End Turn ====\n");
		else
			System.out.println(name + " is Dead, RIP (×_×3)");
	}

}
