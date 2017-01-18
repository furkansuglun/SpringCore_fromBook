package _11.Configuration.Bean.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name="hello")
	public Hello sendMesaj() {
		return new HelloImpl();
	}
}
