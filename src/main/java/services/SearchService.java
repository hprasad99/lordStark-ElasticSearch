package services;

import lombok.extern.slf4j.Slf4j;
import models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

import java.util.List;

@Service
@Slf4j
public class SearchService {
    private final ProductRepository productRepository;

    @Autowired
    public SearchService(ProductRepository productRepository, ElasticsearchOperations elasticsearchOperations){
        super();
        this.productRepository = productRepository;
    }

    public List<Product> fetchProductNames(final String name) {
        return productRepository.findByManufacturerAndCategory(name,"");
    }

    public List<Product> fetchProductNamesContaining(final String name) {
        return productRepository.findByNameContaining(name);
    }
}
