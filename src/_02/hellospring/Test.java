package _02.hellospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Test {

	
	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("02.spring.xml"));
		/*
		 * BeanFactory : design pattern daki Factory pattern'in örneklerinden biridir.
		 * 
		 * Spring IoC Container oluþturmak için öncelikle bir BeanFactory nesnesi oluþturulur.
		 * IoC Container aslýnda bir BeanFactory nesnesidir. IoC Container geri planda nesneleri oluþturup
		 * iliþkilerini kurar. IoC Container nesnesinin üzerinden de diðer bütün ihtiyaç duyudupumuz beanleri alýp
		 * uygulamamýzýn içerisinde kullanýrýz.
		 */
		Car car = (Car) beanFactory.getBean("car");
		
		car.move();
		
	}
	
}
