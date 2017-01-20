package _19.Parameters.Constructor.Dependency.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("19.spring.xml");
		
		B b = (B) applicationContext.getBean("bBean");
		b.showResul();
		
		C c = (C) applicationContext.getBean("cBean");
	}
	
}
