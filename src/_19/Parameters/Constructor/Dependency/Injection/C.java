package _19.Parameters.Constructor.Dependency.Injection;

public class C {

	public C() {
		System.out.println("C sýnýfnýn parametresiz hazýrlayýcý metodu \n\n");
	}
	
	public C(A aNesnesi , B bNesnesi) {
		System.out.println("C sýnýfýnýn A ve B tipinde 2 parametreli hazýrlayýcý metodu.");
		
		aNesnesi.write();
		
		bNesnesi.showResul();
		
		System.out.println("\n");
		
	}
	
	public C(String mesaj , int sayi) {
		System.out.println("C sýnýfýnýn String ve int tipinde 2 parametreli hazýrlayýcý metodu.");
		
		System.out.println(mesaj + " " + sayi);
	}
}
