package _01.composition;

public class Car {

	private Fuel fuel;
	
	public Car() {
		fuel = new Fuel();
	}
	
	public void moveOn() {
		fuel.hasFuel();
		System.out.println("Araba harekete geçti.");
		
	}
	
	
}
