package EventListener.EventListeners.Controller;

import EventListener.EventListeners.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import EventListener.EventListeners.Models.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order.orderID);
    }
}
