package _08.PropertyInitialization;

public class Ev {

	private String kat;

	public String getKat() {
		return kat;
	}

	public void setKat(String kat) {
		this.kat = kat;
	}
	
	public void yaz() {
		System.out.println(getKat()+" katlý bir ev.");
	}
	
}
