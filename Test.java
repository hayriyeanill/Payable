package labWeek5;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	ArrayList<Payable> a=new ArrayList<Payable>();
	
	a.add(new SalariedEmployee("John", "Smith", "111-11-1111", 800.00));
	a.add(new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000.00, 0.04, 300.00));
	a.add(new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.00));
	a.add(new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000.00, 0.06));
	a.add(new Invoice("56789", "tire", 4, 79.95));
	a.add(new Invoice("01234", "seat", 2, 350.00));
	
	
	for (Payable payable : a) {
		displayPayableObject(payable);
		
		}
}
    private static void displayPayableObject(Payable p) {
	
    	if(p instanceof SalariedEmployee) {
		
		System.out.println("Payeble Objects are processed polymorphically: ");
		
		SalariedEmployee s = (SalariedEmployee) p;
		System.out.println("Salaried Employee: " + s.getFirstName() + " " + s.getLastName());
		System.out.println("Social Security Number: " + s.getSsn());
		System.out.println("Weekly Salary: $" + s.getWeeklySalary());                 
		System.out.println("Earned: $" + s.earnings());   
		
		System.out.println("*********************");
		
	}else if(p instanceof HourlyEmployee) {
		HourlyEmployee h = (HourlyEmployee) p;
		System.out.println("Hourly Employee: " + h.getFirstName() + " " + h.getLastName());
	    System.out.println("Social Security Number: " +  h.getSsn());
		System.out.println("Hourly wage: $" + h.getWage()); 
		System.out.println("Hours worked: " + h.getHours()); 
	    System.out.println("Earned: $" + h.earnings());
	    
	    System.out.println("*********************");
	    
	}else if(p instanceof BasePlusCommissionEmployee) {
		BasePlusCommissionEmployee b =(BasePlusCommissionEmployee) p;
		System.out.println("Base-Salaried Commission Employee: " + b.getFirstName() + " " +  b.getLastName());
		System.out.println("Social Security Number: " +  b.getSsn());
		System.out.println("Gross sales: $" + b.getGrossSales()); 
		System.out.println("Commission Rate: " + b.getCommissionRate());
		System.out.println("Base Salary: $" + b.getBaseSalary());
		
		if (p instanceof BasePlusCommissionEmployee) {
			BasePlusCommissionEmployee bpce = (BasePlusCommissionEmployee) p;
			bpce.setBaseSalary(1.10 * bpce.getBaseSalary());
			System.out.printf(
					"new base salary with 10%% increase is: $%,.2f\n",
					bpce.getBaseSalary());
		}

		System.out.println("Earned: $" +b.earnings());
		
		System.out.println("*********************");
	    
	    
	}else if(p instanceof CommissionEmployee) {
		CommissionEmployee c = (CommissionEmployee) p;
		System.out.println("Commission Employee : " + c.getFirstName() + " " + c.getLastName());
		System.out.println("Social Security Number: " + c.getSsn());
		System.out.println("Gross Sales: $" + c.getGrossSales());
		System.out.println("Commission Rate: " + c.getCommissionRate()); 
		System.out.println("Earned: $" + c.earnings());
		
		System.out.println("*********************");
		
	
		
	}else if(p instanceof Invoice) {
		Invoice ý =(Invoice) p;
		System.out.println("Invoice: " + ý.getPartDesc());
		System.out.println("Part Number:" + ý.getPartNumber());
		System.out.println("Quantity "+ ý.getQuantity()); 
		System.out.println("Price Per Item: $"+ ý.getPricePerItem());
		System.out.println("Payment due: $" + ý.getPaymentAmount());
		
		System.out.println("*********************");
	}
	
	
	
	
	
	
}
}
