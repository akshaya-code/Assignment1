package question5;

abstract class Marks {
	protected int markICP, markDSA, percentage;

	public Marks(int markICP, int markDSA) {
		this.markICP = markICP;
		this.markDSA = markDSA;
	}

	public abstract void getPercentage();
}

