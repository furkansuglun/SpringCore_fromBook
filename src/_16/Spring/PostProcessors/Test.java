package _16.Spring.PostProcessors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("16.spring.xml");
		
		Hello hello = (Hello) applicationContext.getBean("hello");
		
		
		hello.show();
		
		
		((AbstractApplicationContext) applicationContext).registerShutdownHook();

	}

}
