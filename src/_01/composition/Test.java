package _01.composition;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.moveOn();
	
		//car ile fuel nesnesi birbirine göbekten baðlý
		//car yoksa fuel de yok .
		
		
		//car sýnýfý varlýgýný test sýnýfýna borçlu
		//fuel sýnýfý varlýðýný car sýnýfýna borçlu
		
		//eðer fuel sýnýfýnda bir deðiþiklik olursa 
		//onu kullanan bütün sýnýflarýn dengesi bozulur
		//hasFuel metoduna parametre eklenseydi ne olurdu düþünmeye býrakýyorum ? 
		
	}
	
}
