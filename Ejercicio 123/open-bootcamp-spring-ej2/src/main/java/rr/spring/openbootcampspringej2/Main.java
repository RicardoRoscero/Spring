package rr.spring.openbootcampspringej2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		UserService userService = (UserService) context.getBean("userService");

		String texto = userService.notificationService.imprimirSaludo();
		System.out.println(texto);

	}
}
