package _07.ApplicationContext;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("resource")
public class Telefon {

	public static void main(String[] args) {
		
		//string dizi içinde baska vonfig dosyalarýnýda ekleyebilriiz.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("07.spring.xml");
		
		Android android = (Android) applicationContext.getBean("android");
		
		android.renk();
	}
	
}
