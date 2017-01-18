package _13.Singleton.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("13.spring.xml");
		
		Hello hello = (Hello) applicationContext.getBean("hello");
		
		hello.setMesaj("Mesajýmýz Gönderiliyor.");
		
		hello.show();
		
		Hello hello2 = (Hello) applicationContext.getBean("hello");
		
		hello2.getMesaj();
		
		hello2.show();
		
		//her iki durumda da ayný nesneyi verdi Çünkü bean signleton dýr.
	}

}
