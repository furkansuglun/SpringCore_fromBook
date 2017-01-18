package _02.hellospring;

public class Car {

	private Fuel fuel;

	public Car(Fuel fuel) {
		super();
		this.fuel = fuel;
	}
	
	public void move() {
		fuel.hasFuel();
		System.out.println("Araç harekete geçti..");
	}
	
}
