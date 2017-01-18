package _12.Configuration.Bean.Import_Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AConfig.class , BConfig.class})
public class TestConfig {

	
}
