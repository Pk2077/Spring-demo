package Beans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
public class config {
	@Bean
	public MobileType typeT() {
		return new MobileType();
	}
}
