package _19.Parameters.Constructor.Dependency.Injection;

import _19.Parameters.Constructor.Dependency.Injection.A;

public class B {

	
	private A aNesnesi;

	public B(A aNesnesi) {
		System.out.println("B sýnýfýnýn constructor ' ý");
		this.aNesnesi = aNesnesi;
	}
	
	public void showResul() {
		System.out.println("B sýnýfýna ait normal bir method.");
		aNesnesi.write();
	}
	
	
}
