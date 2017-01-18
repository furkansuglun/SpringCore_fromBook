package _15.SpringBean.LifeCycle;

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
	
	public void init() {
		System.out.println("Bean starting.");
	}
	
	public void destroy() {
		System.out.println("Bean ending.");
	}
}
