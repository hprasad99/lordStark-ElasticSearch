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

    public List<Product> findProductsByManufactureAndCategory(final String manufacturer, final String category) {
        return productRepository.findByManufacturerAndCategory(manufacturer, category);
    }

    public List<Product> findByProductName(final String productName) {
        return productRepository.findbyName(productName);
    }

    public List<Product> findByProductMatchingNames(final String productName) {
        return productRepository.findByNameContaining(productName);
    }
}
