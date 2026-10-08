package EventListener.EventListeners.Service;

import EventListener.EventListeners.Records.CreateOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    OrderService(ApplicationEventPublisher applicationEventPublisher){
        this.eventPublisher = applicationEventPublisher;
    }

    public void createOrder(String orderId, Integer amount){
        System.out.println("Order created \norder Id: " + orderId);
        eventPublisher.publishEvent(new CreateOrder(orderId, amount));
    }
}
