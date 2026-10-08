package EventListener.EventListeners.Listerns;

import EventListener.EventListeners.Records.CreateOrder;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class WareHouse {

    @Async
    @EventListener
    @Order(1)
    public void newOrderAlert(CreateOrder order) throws InterruptedException {
        System.out.println("Alerting WareHouse for new Order Initiated: " + order.orderId());
        Thread.sleep(500);
        System.out.println("Alerting WareHouse for new Order Completed: " + order.orderId());

    }
}
