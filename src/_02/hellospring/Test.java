package _02.hellospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Test {

	
	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("02.spring.xml"));
		/*
		 * BeanFactory : design pattern daki Factory pattern'in �rneklerinden biridir.
		 * 
		 * Spring IoC Container olu�turmak i�in �ncelikle bir BeanFactory nesnesi olu�turulur.
		 * IoC Container asl�nda bir BeanFactory nesnesidir. IoC Container geri planda nesneleri olu�turup
		 * ili�kilerini kurar. IoC Container nesnesinin �zerinden de di�er b�t�n ihtiya� duyudupumuz beanleri al�p
		 * uygulamam�z�n i�erisinde kullan�r�z.
		 */
		Car car = (Car) beanFactory.getBean("car");
		
		car.move();
		
	}
	
}
