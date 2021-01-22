package entities;

import java.util.Date;

public class HourContract {

	// atributos
	private Date date;
	private double valuePerHour;
	private int hours;
	
	// construtores
	public HourContract() {
	}

	public HourContract(Date date, double valuePerHour, int hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	// métodos
	public double totalValue() {
		return hours * valuePerHour;
	}

	// getters e setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
}
