package _09.OneParameter.ConstructorInjection;

public class Ev {

	private String kat;

	
	public Ev(String kat) {
		super();
		this.kat = kat;
	}

	//------------------
	
	
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
