package _12.Configuration.Bean.Import_Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import _12.Configuration.Bean.Import.A;

@Configuration
public class AConfig {

	@Bean(name="aBean")
	public A wirite() {
		return new A();
	}
}
