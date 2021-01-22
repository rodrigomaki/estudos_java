package secao8_exercicio3;

public class Student {

	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double missGrade() {
		return 60 - (n1 + n2 + n3);
	}
	
	public String toString() {
		if ((n1 + n2 + n3) >= 60) {
			double finalGrade = (n1 + n2 + n3);
			return String.format("FINAL GRADE = %.2f \nPASS", finalGrade);
		} else {
			double finalGrade = (n1 + n2 + n3);
			return String.format("FINAL GRADE = %.2f \nFAILED\nMISSING %.2f POINTS", finalGrade, missGrade());
		}
	}
	
}
