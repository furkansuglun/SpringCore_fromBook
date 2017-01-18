package _10.MultipleParameters.ConstructorInjection;

import org.springframework.cglib.core.Converter;

public class Ev {

	private int kat;
	private String durum;
	
	

	

	public Ev(int kat, String durum) {
		super();
		this.kat = kat;
		this.durum = durum;
	}

	//------------------
	
	
	
	public String getDurum() {
		return durum;
	}

	public int getKat() {
		return kat;
	}

	public void setKat(int kat) {
		this.kat = kat;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	
	public void yaz() {
		System.out.println(getKat()+" katlı bir ev.ve Ev durumu : " + getDurum());
	}
	
}
