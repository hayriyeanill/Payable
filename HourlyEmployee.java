package labWeek5;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(wage == 0)
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = Math.min(8, hours);
	}
	
	public double earnings() {
		return getHours() * getWage();
	}

	@Override
	public String toString() {
		return String.format("Name:%s, Surname:%s, SSN: %s, Commission:%f, Wage:%f, Hours:%f" + 
							getFirstName(), getLastName(), getSsn(),  wage, hours );
	}
	
	
	
      
}
