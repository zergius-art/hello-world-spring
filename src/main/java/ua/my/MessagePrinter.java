package ua.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Component class for using as a Bean
 */
@Component
public class MessagePrinter {

    @Autowired
    private MessageService messageService;

    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }
}
