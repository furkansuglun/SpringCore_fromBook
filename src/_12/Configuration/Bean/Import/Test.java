package _12.Configuration.Bean.Import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import _12.Configuration.Bean.Import_Config.TestConfig;

@SuppressWarnings("resource")
public class Test {

	public static void main(String[] args) {
		
	
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
		
		A a = (A)applicationContext.getBean("aBean");
		a.write("Furkan");
		
		B b = (B)applicationContext.getBean("bBean");
		b.write("Süðlün");
		
	}
	
}
