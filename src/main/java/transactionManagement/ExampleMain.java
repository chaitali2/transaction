package transactionManagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import transactionManagement.example.OrderController;

public class ExampleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TransactionConfig.class);
        OrderController orderController = context.getBean(OrderController.class);
        orderController.saveorderdetail();
    }




}
