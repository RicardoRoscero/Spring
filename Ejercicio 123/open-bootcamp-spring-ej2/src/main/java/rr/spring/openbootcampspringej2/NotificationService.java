package rr.spring.openbootcampspringej2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("Ejecutando constructor Saludo");
    }
    public String imprimirSaludo(){
        return "Hola que tal?";
    }
}
