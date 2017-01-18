package _18.Constructor.Dependency.Injection;

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
