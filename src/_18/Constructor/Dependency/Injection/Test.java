package _18.Constructor.Dependency.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("18.spring.xml");
		
		B b = (B) applicationContext.getBean("bBean");
		
		b.showResul();
		
	}
	
	
}
