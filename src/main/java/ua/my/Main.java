package ua.my;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * The simplest "Hello World" with using Spring and without XML
 * class Main is both - Starter and Configuration
 */
@Configuration
@ComponentScan
public class Main {

    /**
     * This Bean Inject Dependencies between Service interface
     * "MessageService" and class "MessagePrinter"
     * and @return "Hello World!!!" to console
     */
    @Bean
    MessageService service () {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!!!";
            }
        };
    }

    /**
     * Starter method uses single Bean
     */
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
