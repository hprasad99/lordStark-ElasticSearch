package services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductSearchService {
    private static final String PRODUCT_INDEX = "productindex";

    private ElasticsearchOperations elasticsearchOperations;


}
