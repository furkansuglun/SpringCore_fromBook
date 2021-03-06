package _15.SpringBean.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("15.spring.xml");
		
		Hello hello = (Hello) applicationContext.getBean("hello");
		
		
		hello.show();
		
		//Bean sonlandırıldıktan sonra bir metodun çalışması için bu kodun en sonda bulunması gerekmektedir.
		((AbstractApplicationContext) applicationContext).registerShutdownHook();

	}

}
