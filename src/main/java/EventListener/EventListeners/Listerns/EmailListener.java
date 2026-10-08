package EventListener.EventListeners.Listerns;

import EventListener.EventListeners.Records.CreateOrder;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @Async
    @EventListener
    @Order(2)
    public void OrderCreationEmail(CreateOrder order) throws InterruptedException {
        System.out.println("Email Send for Order created Initiated: " + order.orderId());
        Thread.sleep(500);
        System.out.println("Email Send for Order created Completed: " + order.orderId());

    }
}
