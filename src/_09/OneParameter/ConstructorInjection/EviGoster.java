package _09.OneParameter.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EviGoster {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("09.spring.xml");
		
		Ev ev = (Ev) applicationContext.getBean("ev");
		
		ev.yaz();
		
	}
	
}
