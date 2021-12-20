package templateStudent;

public abstract class AbstractStudent {
	
	public final void DailyRoutine() {
		if (goToBraude())
		{
			study();
		}
		relax();
	}
	
	public abstract boolean goToBraude();
	
	public abstract void study();
	
	public void relax() {
		study();
	}
}
