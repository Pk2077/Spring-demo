package Beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Mobile {
	
	public static void main(String[]args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		MobileType S7 = context.getBean(MobileType.class);
		S7.type();
	} 

}
