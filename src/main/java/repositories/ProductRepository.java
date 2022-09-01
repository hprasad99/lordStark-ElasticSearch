package repositories;

import models.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findbyName(String name);

    List<Product> findByNameContaining(String name);

    List<Product> findByManufacturerAndCategory(String manufacturer,String category);
}
