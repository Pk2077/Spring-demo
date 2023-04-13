package SchoolPkg;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public abstract class School{
	
	private static Movie movie;
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Movie obj = (Movie)context.getBean("movie");
		obj.print("One Piece");
	}

}
