package _17.Spring.Bean.Definition.Inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("17.spring.xml");
		
		Hello hello = (Hello) applicationContext.getBean("hello");
		
		hello.show();
		
		Author author = (Author) applicationContext.getBean("author");
		
		author.show();
		
		
	}

}
