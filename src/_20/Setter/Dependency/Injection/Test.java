package _20.Setter.Dependency.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("20.spring.xml");
		
		B b = (B) applicationContext.getBean("bBean");
		
		b.showResult();
		
		System.out.println("\n" + b.getMesaj() + " <-> " + b.getSayi() + "\n");
		
		//setter injection ile a s�n�f�n�n write metodunu ald�k
		//setter injection'� config dosyas�nda property name ve ref="aBean" ile yapt�k
		b.getaNesnesi().write();
		
	}
	
	
}
