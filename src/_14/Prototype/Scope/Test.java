package _14.Prototype.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("14.spring.xml");
		
		Hello hello = (Hello) applicationContext.getBean("hello");
		
		hello.setMesaj("Mesaj�m�z G�nderiliyor.");
		
		hello.show();
		
		Hello hello2 = (Hello) applicationContext.getBean("hello");
		
		hello2.getMesaj();
		//hello2.setMesaj("prototype ile mesaj nesnesi de�i�melidir.");
		hello2.show();
		
		//her iki durumda da ayn� nesneyi vermedi . ��nk� bean prototype t�r.
	}

}
