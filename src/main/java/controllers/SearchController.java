package controllers;

import lombok.extern.slf4j.Slf4j;
import models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.ProductSearchService;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class SearchController {

    private final ProductSearchService searchService;

    @Autowired
    public SearchController(ProductSearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/products")
    @ResponseBody
    public List<Product> fetchByNameOrDesc(@RequestParam(value = "q", required = false) String query){
        log.info("searching by name {}", query);
        List<Product> products = searchService.processSearch(query);
        log.info("products {}",products);
        return products;
    }

    @GetMapping("/suggestions")
    @ResponseBody
    public List<String> fetchSuggestions(@RequestParam(value = "q", required = false) String query){
        log.info("fetch suggests {}", query);
        List<String> suggests = searchService.fetchSuggestions(query);
        log.info("suggests {}", suggests);
        return suggests;
    }
}
