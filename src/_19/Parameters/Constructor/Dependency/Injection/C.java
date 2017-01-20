package _19.Parameters.Constructor.Dependency.Injection;

public class C {

	public C() {
		System.out.println("C s�n�fn�n parametresiz haz�rlay�c� metodu \n\n");
	}
	
	public C(A aNesnesi , B bNesnesi) {
		System.out.println("C s�n�f�n�n A ve B tipinde 2 parametreli haz�rlay�c� metodu.");
		
		aNesnesi.write();
		
		bNesnesi.showResul();
		
		System.out.println("\n");
		
	}
	
	public C(String mesaj , int sayi) {
		System.out.println("C s�n�f�n�n String ve int tipinde 2 parametreli haz�rlay�c� metodu.");
		
		System.out.println(mesaj + " " + sayi);
	}
}
