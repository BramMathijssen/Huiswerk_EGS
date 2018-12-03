package sample.web.ui.repository;

import org.springframework.data.repository.CrudRepository;
import sample.web.ui.domain.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
