package transactionManagement.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class OrderController {
    @Autowired
    OrderRepository orderRepository;
    public void saveorderdetail(){
        orderRepository.saveorderdetail();
    }
}
