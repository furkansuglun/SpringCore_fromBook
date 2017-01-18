package _12.Configuration.Bean.Import_Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import _12.Configuration.Bean.Import.B;

@Configuration
public class BConfig {

	@Bean(name="bBean")
	public B write() {
		return new B();
	}
	
	
	
}
