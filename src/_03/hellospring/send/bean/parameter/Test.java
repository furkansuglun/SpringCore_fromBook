package _03.hellospring.send.bean.parameter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("03.spring.xml"));
		
		Car car = (Car) beanFactory.getBean("car");
		
		car.move();
		
	}
	
}
