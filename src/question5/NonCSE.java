package question5;
class NonCSE extends Marks {
	private int enggMechanics;

	public NonCSE(int markICP, int markDSA, int enggMechanics) {
		super(markICP, markDSA);
		this.enggMechanics = enggMechanics;
	}

	@Override
	public void getPercentage() {
		percentage = (markICP + markDSA + enggMechanics) / 3;
		System.out.println("Non-CSE Student Percentage: " + percentage);
	}
}
