package question2;

public class Product {
	int prodid;
	double price;
	int quantity;
	static double totalPrice;

	public Product(int prodid, double price, int quantity) {
		this.prodid = prodid;
		this.price = price;
		this.quantity = quantity;
		totalPrice = totalPrice + (price * quantity);
	}

	public void display() {
		System.out.println("Product ID: " + prodid + ", Price: " + price + ", Quantity:" + quantity);
	}

	public static void main(String[] args) {
		Product[] products = new Product[5];
		products[0] = new Product(1, 10.5, 2);
		products[1] = new Product(2, 20.0, 1);
		products[2] = new Product(3, 15.5, 3);
		products[3] = new Product(4, 8.0, 4);
		products[4] = new Product(5, 12.5, 2);
		for (Product product : products) {
			product.display();
		}
		System.out.println("Total price paid by the person for 5 products "+totalPrice);
	}

}
