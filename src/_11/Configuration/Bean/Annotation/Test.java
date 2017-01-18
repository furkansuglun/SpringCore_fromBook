package _11.Configuration.Bean.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hello hello = (Hello) context.getBean("hello");
		
		hello.sendMessage("Vazgeçmek korkaklara göredir.");
		
	}
	
}
