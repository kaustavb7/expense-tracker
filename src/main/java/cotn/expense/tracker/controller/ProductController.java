package cotn.expense.tracker.controller;

import cotn.expense.tracker.model.Category;
import cotn.expense.tracker.model.Product;
import cotn.expense.tracker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author kaustavbasu
 * @Date 8/16/20
 * @Time 3:32 PM
 */
@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/create/{category_id}")
    public ResponseEntity<Product> createProduct(@RequestBody Product product, @PathVariable Long category_id) {

        productService.saveProduct(product,category_id);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
}
