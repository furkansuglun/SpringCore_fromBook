package _03.hellospring.send.bean.parameter;

public class Car {

	private Fuel fuel;

	public Car(Fuel fuel) {
		super();
		this.fuel = fuel;
	}
	
	
	public void move() {
		fuel.hasFuel();
		System.out.println("Araba harekete geçti.");
	}
}
