package lab11;

public class UsedCar extends Car {
	private String make;
	private String model;
	private int year;
	private double price;
	private double mileage;
	
	public UsedCar(String make) {
		super();
		this.make = make;
	}

	public UsedCar(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	public UsedCar(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public UsedCar(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public UsedCar(String make, String model, int year, double price, int mileage) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.mileage = mileage;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "UsedCar [make = " + make + ", model = " + model + ", year = " + year 
				+ ", price=" + price + ", mileage = "
				+ mileage + "]";
	}
	
	
	
}
