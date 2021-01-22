package entities;

import java.util.Date;

public class HourContract {

	// atributos
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	// construtores
	public HourContract() {
		
	}
	
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	// métodos
	public Double totalValue() {
		return valuePerHour * hours;
	}
	
	// getters e setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
}
