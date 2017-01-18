package _18.Constructor.Dependency.Injection;

public class B {

	private A aNesnesi;

	public B(A aNesnesi) {
		System.out.println("B s�n�f�n�n constructor ' �");
		this.aNesnesi = aNesnesi;
	}
	
	public void showResul() {
		System.out.println("B s�n�f�na ait normal bir method.");
		aNesnesi.write();
	}
	
	
}
