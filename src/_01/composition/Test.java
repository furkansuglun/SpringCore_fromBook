package _01.composition;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.moveOn();
	
		//car ile fuel nesnesi birbirine g�bekten ba�l�
		//car yoksa fuel de yok .
		
		
		//car s�n�f� varl�g�n� test s�n�f�na bor�lu
		//fuel s�n�f� varl���n� car s�n�f�na bor�lu
		
		//e�er fuel s�n�f�nda bir de�i�iklik olursa 
		//onu kullanan b�t�n s�n�flar�n dengesi bozulur
		//hasFuel metoduna parametre eklenseydi ne olurdu d���nmeye b�rak�yorum ? 
		
	}
	
}
