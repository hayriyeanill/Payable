package labWeek5;

public  class Invoice implements Payable {

	private String partNumber;
	private String partDesc;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDesc, int quantity, double pricePerItem) {
		
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	@Override
	public String toString() {
		return String.format("partNumber %s, partDesc %s, quantity %d, pricePerItem %f", 
				partNumber, partDesc, quantity, pricePerItem);
	}

	
	
	
	
	
}
