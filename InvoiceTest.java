package exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvoiceTest {

	@Test
	void testGetInvoiceAmount() {

		Invoice invoice1 = new Invoice("001", "Fruits", 2, 3);
		double result1 = invoice1.getInvoiceAmount();
		assertEquals(6.0, result1 );
		
		Invoice invoice2 = new Invoice("002", "Furniture", 0, 3);
		double result2 = invoice2.getInvoiceAmount();
		assertEquals(0.0, result2 );
		
		Invoice invoice3 = new Invoice("003", "Toys", 2, 0);
		double result3 = invoice3.getInvoiceAmount();
		assertEquals(0.0, result3 );
		
		Invoice invoice4 = new Invoice("004", "Electronic", -1, 3);
		double result4 = invoice4.getInvoiceAmount();
		assertEquals(0.0, result4 );
		
		Invoice invoice5 = new Invoice("005", "Gardening", 2, -2);
		double result5 = invoice5.getInvoiceAmount();
		assertEquals(0.0, result5 );
	
	}

}
