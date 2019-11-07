package transactionManagement.example;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class OrderRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void saveorderdetail() {
        Order order = new Order("SOAP", 2);
        entityManager.persist(order);
    }
}
