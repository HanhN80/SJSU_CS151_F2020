
public class Product {
	private String name;
	private String description;
	private Double price;
	private Double quantity;
	private Double maxquantity;
	
	public Product(String name, String description, Double price, Double quantity, Double maxquantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.maxquantity = maxquantity;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public void setquantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getname() {
		return name;
	}
	public String getdescription() {
		return description;
	}
	public Double getprice() {
		return price;
	}
	public Double getquantity() {
		return quantity;
	}
	public Double getmaxquantity() {
		return maxquantity;
	}
	public String toString() {
		String str = "Name" + getname()+ "\nDescription" + getdescription() + "\nPrice" + getprice() + "\nQuantity" + getquantity();
		return str;
	}
	
}
