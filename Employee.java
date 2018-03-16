package labWeek5;

public abstract class Employee implements Payable {
	
	private String firstName;
	private String lastName;
	private String ssn;
	
	public Employee(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	@Override
	public double getPaymentAmount() {
		return 0;
	}
	
	public abstract double earnings();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return String.format("Name:%s, Surname:%s, SSN:%s", firstName, lastName, ssn);
	}
	
	

}
