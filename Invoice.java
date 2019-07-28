package exercise1;

public class Invoice {

	private String partNumber;
	private String description;
	private int quantity;
	private Double price;
//Constructor
	public Invoice(String part, String desc, int quant, double pri) {
		partNumber = part;
		description = desc;
		quantity = quant;
		price = pri;
	}
//Get and Set methods
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
//Rest of the methods
	public double getInvoiceAmount() {
		
	
		
		if(quantity < 0) {
			quantity = 0;
		}
		else if(price < 0) {
			price = 0.0;
			
		}
		double amount = quantity * price;
		
		return amount;
	}
	

	public static void main(String[] args) {
		
		

	}

}
