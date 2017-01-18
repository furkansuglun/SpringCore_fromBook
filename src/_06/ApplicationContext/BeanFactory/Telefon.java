package _06.ApplicationContext.BeanFactory;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("resource")
public class Telefon {

	public static void main(String[] args) {
		
		//string dizi içinde baska vonfig dosyalarýnýda ekleyebilriiz.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"06.spring.xml"});
		
		BeanFactory beanFactory = applicationContext;
		
		Android android = (Android) beanFactory.getBean("android");
		
		android.renk();
	}
	
}
