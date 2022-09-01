package controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ProductSearchService;

@RestController
@RequestMapping("/")
@Slf4j
public class SearchController {

    private ProductSearchService searchService;

}
