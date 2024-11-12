package question5;

class CSE extends Marks {
	private int algoDesign;

	public CSE(int markICP, int markDSA, int algoDesign) {
		super(markICP, markDSA);
		this.algoDesign = algoDesign;
	}

	@Override
	public void getPercentage() {
		percentage = (markICP + markDSA + algoDesign) / 3;
		System.out.println("CSE Student Percentage: " + percentage);
	}
}
