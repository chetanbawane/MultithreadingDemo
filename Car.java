package exceptionPackage;

public class Car extends Vehicle {
	
	public int NoOfSeats;
	
	public Car(String brandname, int noOfSeats) {
		super(brandname);
		NoOfSeats = noOfSeats;
	}

	public int getNoOfSeats() {
		return NoOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		NoOfSeats = noOfSeats;
	}
	
	@Override
	public void start() {
		System.out.println("Car is starting...");
	}

	public void displaycardetails() {
		vehicledetails();
		System.out.println("NoOfSeates= "+ NoOfSeats);
	}
	public static void main(String[] args) {
		Vehicle veh= new Vehicle("Not define yet");
		veh.vehicledetails();
		veh.start();
		
		System.out.println("-----------------------------------");
		
		Car car= new Car("TATA", 5);
		car.displaycardetails();
		car.start();
	}

}
