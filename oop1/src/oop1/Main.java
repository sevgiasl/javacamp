package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();		
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");
		
		Product[] products= {product1,product2,product3};
		System.out.println("<ul>");
		
		for (Product product : products) {
			
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhone("0 55500000");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("11111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[]customers= {individualCustomer,corporateCustomer};
		
	}

}
