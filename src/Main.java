class Store {
	private String address;
	private String name;
	private String product;
	private String unavailable;

	public String getProduct()  {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getUnavailable() {
		return unavailable;
	}

	public void setUnavailable(String unavailable) {
		this.unavailable = unavailable;
	}

	public Store(String address, String name, String product, String unavailable) {
		super();
		this.address = address;
		this.name = name;
		this.product = product;
		this.unavailable = unavailable;
	}

	public Store(String address, String name) {
		super();
		this.address = address;
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Store() {
		this("", "", "", "");
	}

	public void store() {
		System.out.println("Store address is: " + this.address);
		System.out.println("Store name is: " + this.name);
	}

	public void product() {
		System.out.println("Added product is: " + this.product);
	}

	public void unavailablepr() {
		System.out.println("The product is: " + this.unavailable);
	}
}

public class Main {

	public static void main(String[] args) {
		Store billa = new Store("Sofia", "Billa", "detergent", "unvailable");
		billa.store();
		billa.product();
		billa.unavailablepr();

	}
}
