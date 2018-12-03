package sample.web.ui.repository;

import org.springframework.data.repository.CrudRepository;
import sample.web.ui.domain.ProductCatalog;

import java.util.List;

public interface ProductCatalogRepository extends CrudRepository<ProductCatalog, Long> {
}
