package entities;

public class Individual extends TaxPayer{

	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double result = 0.0;
		if(getAnualIncome() < 20000.0) {
			result = getAnualIncome() * 0.15;
		} else {
			result = getAnualIncome() * 0.25;
		}
		
		if(healthExpenditures > 0) {
			result -= healthExpenditures * 0.5;
		}
		return result;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

}
