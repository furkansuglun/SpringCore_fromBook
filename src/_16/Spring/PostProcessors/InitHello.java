package _16.Spring.PostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHello implements BeanPostProcessor {

	
	//PostProcessors: Çalýþma esnasýnda beanlerin yasam döngülerine müdahaleye izin verir.
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After starting " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before starting " + beanName);
		return bean;
	}

	
	
}
