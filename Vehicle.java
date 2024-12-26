package exceptionPackage;

public class Vehicle {
	
	public String brandname;

	public Vehicle(String brandname) {
		this.brandname = brandname;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	public void vehicledetails() {
		System.out.println("Brand= "+ brandname);
	}
	
	public void start() {
		System.out.println("Vehicle is starting...");
	}
}
