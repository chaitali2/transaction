package transactionManagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TransactionConfig.class);
        OrderItemClientBean orderItemClientBean = context.getBean(OrderItemClientBean.class);
        orderItemClientBean.persistOrderItems();
    }




}
