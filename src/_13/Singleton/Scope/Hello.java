package _13.Singleton.Scope;

public class Hello {

	
	private String mesaj;

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	public void show() {
		System.out.println(getMesaj());
	}
	
}
