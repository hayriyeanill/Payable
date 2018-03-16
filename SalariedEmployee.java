package labWeek5;

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	
	public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;
	}


	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double earnings() {
		return getWeeklySalary() * 4;
	}
	
	
	@Override
	public String toString() {
		return String.format("Name:%s, Surname:%s, SSN:%s, Weekly Salary:%f",
				getFirstName(), getLastName(), getSsn(), weeklySalary);
	}
	
	
	
	

}
