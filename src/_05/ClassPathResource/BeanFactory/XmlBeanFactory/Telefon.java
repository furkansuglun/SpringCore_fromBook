package _05.ClassPathResource.BeanFactory.XmlBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Telefon {

	public static void main(String[] args) {
		
		ClassPathResource classPathResource = new ClassPathResource("05.spring.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		
		Android android = (Android) beanFactory.getBean("android");
		
		android.renk();
	}
	
}
