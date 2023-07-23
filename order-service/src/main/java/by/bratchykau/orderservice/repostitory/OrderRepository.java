package by.bratchykau.orderservice.repostitory;

import by.bratchykau.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
