package sample.web.ui.repository;

import org.springframework.data.repository.CrudRepository;
import sample.web.ui.domain.Order;

import java.util.ArrayList;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
