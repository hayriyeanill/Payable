package labWeek5;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;
	
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, 
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary > 0)
		this.baseSalary = baseSalary;
	}

	public double earnings() {
		return getBaseSalary() + (getCommissionRate() * getGrossSales());
	}
	
	@Override
	public String toString() {
		return String.format("Name:%s, Surname:%s, SSN: %s, Commission:%f, Gross sales: %f, Base Salary:%f",
				getFirstName(), getLastName(), getSsn(), getCommissionRate(), getGrossSales(), baseSalary);
	}
	
	
	
	

}
