package services;

import models.Product;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

import java.util.List;

@Service
public class ProductSearchServiceWithRepo {

    private ProductRepository productRepository;

    public void createProductIndexBulk(final List<Product> products){
        productRepository.saveAll(products);
    }

    public void createProductIndex(final Product product){
        productRepository.save(product);
    }
}
