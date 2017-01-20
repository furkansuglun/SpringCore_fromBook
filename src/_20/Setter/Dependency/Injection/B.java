package _20.Setter.Dependency.Injection;

public class B {

	private A aNesnesi;

	
	
	public B(A aNesnesi) {
		System.out.println("B sýnýfýna ait constructor");
		this.aNesnesi = aNesnesi;
	}

	public void setaNesnesi(A aNesnesi) {
		this.aNesnesi = aNesnesi;
	}
	
	public A getaNesnesi() {
		return aNesnesi;
	}
	
	public void showResult() {
		System.out.println("B sýnýfýna ait normal bir method.");
		aNesnesi.write();
	}
	
	//---------------------------
	
	private String mesaj;
	private int sayi;

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	
	
	
}
